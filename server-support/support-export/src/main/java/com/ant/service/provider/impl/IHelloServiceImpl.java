package com.ant.service.provider.impl;


import com.ant.service.provider.IHelloService;
import org.apache.dubbo.config.annotation.Service;

/**
 * <p>
 * Provider Demo
 * </p>
 *
 * @author GaoXin
 * @since 2021/9/30 5:59 下午
 */
@Service
public class IHelloServiceImpl implements IHelloService {

    @Override
    public String sayHello(String name) {
        return "Hello," + name + " (from Dubbo with Spring Boot)";
    }
}
