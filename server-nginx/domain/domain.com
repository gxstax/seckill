
server {
    listen 7081;
    location /sayhello {
        default_type text/plain;
            proxy_pass http://backend/demo;
        #content_by_lua_block {
        #    ngx.say("hello world!!!")
        #}
    }
}