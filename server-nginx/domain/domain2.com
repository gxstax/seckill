server {
  listen 7081;
  location /sayhello{
      default_type text/plain;
      proxy_pass http://backend;
  }

    location /activity/query {
            default_type text/plain;
            proxy_pass http://backend/activity/query;
    }

   # 进结算页页面（H5）
      location /api/settlement/page {
              default_type text/html;
              proxy_pass http://backend/demo;
      }

      # 结算页页面初始化渲染所需数据
      location /api/settlement/initData {
              default_type text/plain;
              proxy_pass http://backend/demo;
      }

      # 结算页提交订单
      location /api/settlement/submitData {
              default_type text/plain;
              proxy_pass http://backend/demo;

      }

      # 结算页用户行为操作，模糊匹配
      location ～*/api/settlement/submitData {
              default_type text/plain;
              proxy_pass http://backend/demo;
      }
}