package com.ant;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * <p>
 *
 * </p>
 *
 * @Author Ant
 * @Date 2022/10/15 17:05
 */
@EnableDubbo
@SpringBootApplication
public class ApplicationServerApplication {
    public static void main(String[] args) {
        SpringApplication.run(ApplicationServerApplication.class, args);
    }
}
