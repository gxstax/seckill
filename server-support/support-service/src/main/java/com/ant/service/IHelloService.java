package com.ant.service;

import org.apache.dubbo.config.annotation.Service;

/**
 * <p>
 * 定义服务接口
 * </p>
 *
 * @author GaoXin
 * @since 2021/10/9 10:49 上午
 */
public interface IHelloService {
    String sayHello(String name);
}
