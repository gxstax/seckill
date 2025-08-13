# server-nginx

## 配置

* **upstream**

1. 反向代理配置： 定义后端服务集群地址 
2. 为 proxy_pass 等指令提供服务器组引用

* **location**

  1. URL 路径匹配
  根据请求的 URI 路径进行匹配
  执行相应的处理逻辑
  2. 请求路由
  将不同路径的请求转发到不同的后端服务
  实现 API 网关功能
  3. 静态资源处理
  直接提供静态文件服务
  设置缓存策略
```nginx
# 精确匹配
location = /exact/path {
    # 只匹配 /exact/path
}

# 前缀匹配（优先级较高）
location ^~ /prefix/ {
    # 匹配以 /prefix/ 开头的路径
}

# 正则表达式匹配（优先级高）
location ~ \.php$ {
    # 匹配以 .php 结尾的路径
}

# 不区分大小写的正则匹配
location ~* \.(jpg|jpeg|png|gif)$ {
    # 匹配图片文件请求
}

# 普通前缀匹配（优先级最低）
location /api/ {
    # 匹配所有以 /api/ 开头的路径
}
```