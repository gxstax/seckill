package com.ant;

import com.ant.domain.product.repository.mapper.ProductsMapper;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@MapperScan("com.ant.domain.product.repository")
public class Application {
    private final ProductsMapper productsMapper;

    public Application(ProductsMapper productsMapper) {
        this.productsMapper = productsMapper;
    }

    public static void main(String[] args) {
        SpringApplication.run(Application.class);
    }

    @Bean
    CommandLineRunner sampleCommandLineRunner() {
        return args -> {
            System.out.println(this.productsMapper.selectProduct(1L));
        };
    }

}
