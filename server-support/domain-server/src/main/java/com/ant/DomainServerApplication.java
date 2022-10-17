package com.ant;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * <p>
 * 领域服务应用
 * </p>
 *
 * @Author Ant
 * @Date 2022/10/15 17:26
 */
@EnableDubbo
@SpringBootApplication
public class DomainServerApplication {
    public static void main(String[] args) {
        SpringApplication.run(DomainServerApplication.class, args);
    }
}
