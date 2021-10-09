package com.ant;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 * <p>
 * Dubbo消费者
 * </p>
 *
 * @author GaoXin
 * @since 2021/10/9 11:41 上午
 */
@SpringBootApplication
public class DubboConsumer {

    public static void main(String[] args) {
        SpringApplication.run(DubboConsumer.class, args);
    }

}
