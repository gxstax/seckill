package com.ant.consumer;


import com.ant.ProductService;
import com.ant.domain.SkuInfo;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.stereotype.Service;

/**
 * <p>
 *
 * </p>
 *
 * @author Ant
 * @date 2022/10/05 01:33
 */
@Service
public class ProductConsumer {

    @DubboReference
    private ProductService productService;

    public SkuInfo getSkuInfo(String skuId) {
        return productService.getSkuInfo(skuId);
    }
}
