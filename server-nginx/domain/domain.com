log_format  access  '$remote_addr - $remote_user [$time_local] "$request" '

                               '$status $body_bytes_sent "$http_referer" '

                               '"$http_user_agent" "$http_x_forwarded_for"';
server {
    listen 7082;

    error_log logs/domain-error.log error;
    access_log logs/domain-access.log access;
    default_type text/plain;

    #用户ID
    set_by_lua_block $user_id {
        return "zhangsan"
    }

    location /sayhello {
        default_type text/plain;
        proxy_pass http://backend/sayhello;
        #content_by_lua_block {
        #    ngx.say("hello world!!!")
        #}
    }

    #活动数据查询
    location /activity/query {
            limit_req zone=limit_by_user nodelay;
            proxy_pass http://backend;
    }

}
