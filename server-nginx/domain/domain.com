log_format access '$remote_addr - $remote_user [$time_local] "$request" '
                  '$status $body_bytes_sent "$http_referer" '
                  '"$http_user_agent" "$http_x_forwarded_for"';
server {
    listen 7082;

    error_log logs/domain-error.log error;
    access_log logs/domain-access.log access;
    default_type text/plain;
    charset utf-8;

    #security token
    set $st "";

    #产品编号
    set $product_id "";

    #用户ID
    set_by_lua_file $user_id /Users/ant/work/projects/java/seckill/server-nginx/lua/set_common_var.lua;

    #用户ID
    set_by_lua_block $user_id {
        return "zhangsan"
    }

    #活动数据查询
    location /activity/query {
        limit_req zone=limit_by_user nodelay;
        proxy_pass http://backend;
        # 设置返回的 header，并将security token 放到 header 中
        header_filter_by_lua_block {
            ngx.header["st"] = ngx.md5(ngx.var.user_id.."1")
            ngx.header["Access-Control-Expose-Header"] = "st"
        }

    }

    #进结算页页面（H5）
    location /settlement/prePage{
        default_type text/html;
        rewrite_by_lua_block{
            --校验活动查询的st
            local _st = ngx.md5(ngx.var.user_id.."1")
            --校验不通过时，以500状态码，返回对应错误页
            if _st ~= ngx.var.st then
              ngx.log(ngx.ERR,"st is not valid!!")
              return ngx.exit(500)
            end
            --校验通过时，再生成个新的st，用于下个接口校验
            local new_st = ngx.md5(ngx.var.user_id.."2")
            --ngx.exec执行内部跳转,浏览器URL不会发生变化
            --ngx.redirect(url,status) 其中status为301或302
            local redirect_url = "/settlement/page".."?productId="..ngx.var.product_id.."&st="..new_st
            return ngx.redirect(redirect_url,302)
        }
        error_page 500 502 503 504 /html_fail.html;
    }

    #进结算页页面（H5）
    location /settlement/page{
        default_type text/html;
        proxy_pass http://backend;
        error_page 500 502 503 504 /html_fail.html;
    }

}
