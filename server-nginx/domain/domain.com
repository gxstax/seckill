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

}
