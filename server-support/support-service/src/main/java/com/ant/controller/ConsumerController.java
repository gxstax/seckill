package com.ant.controller;

import com.ant.service.provider.IHelloService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 * 功能描述
 * </p>
 *
 * @author GaoXin
 * @since 2021/10/9 11:37 上午
 */
@RestController
public class ConsumerController {

    @Reference
    private IHelloService iHelloService;

    @RequestMapping("/sayHello/{name}")
    public String sayHello(@PathVariable String name) {
        return iHelloService.sayHello(name);
    }

}
