package com.ant.controller;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.Map;

/**
 * <p>
 *  活动控制器
 * </p>
 *
 * @author Ant
 * @date 2022/10/09 10:09
 */
@Controller
@RequestMapping("/activity")
public class ActivityController {
    Logger logger = LoggerFactory.getLogger(ActivityController.class);

    @Value("${application.message:Hello World}")
    private String message = "Hello World";

    @RequestMapping(value = "/query")
    public String product(Model model) {
        return "login";
    }

    @GetMapping("product")
    public String product(Map<String, Object> model) {
        logger.info("product request...");
        return "product";
    }

    @GetMapping("welcome")
    public String welcome(Map<String, Object> model) {
        logger.info("welcome request...");
        return "/welcome";
    }

}
