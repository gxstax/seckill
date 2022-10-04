package com.ant.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 * DEMO
 * </p>
 *
 * @author Ant
 * @since 2021/9/29 8:56 下午
 */
@RestController
public class DemoController {

    @RequestMapping(value = "/sayhello", method = RequestMethod.GET)
    public String demo() {
        return "Hello a";
    }
}
