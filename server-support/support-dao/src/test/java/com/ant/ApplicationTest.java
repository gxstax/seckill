package com.ant;

import com.ant.domain.product.repository.facade.ProductRepositoryInterface;
import com.ant.domain.product.repository.mapper.ProductsMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ApplicationTest {

    @Autowired
    private ProductRepositoryInterface productRepositoryInterface;

    @Test
    public void getProductById() {
        System.out.println(productRepositoryInterface.getProductById(1L));
    }
}
