package com.ant;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * <p>
 * Dubbo服务提供者
 * </p>
 *
 * @author GaoXin
 * @since 2021/9/30 6:10 下午
 */
@SpringBootApplication
public class DubboProvider {

    public static void main(String[] args) {
        SpringApplication.run(DubboProvider.class, args);
    }

}
