package com.ant.application;


import com.ant.consumer.ProductConsumer;
import com.ant.domain.SkuInfo;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 *
 * </p>
 *
 * @author Ant
 * @date 2022/10/05 01:35
 */
@RestController
public class ProductController {

    private final ProductConsumer productConsumer;

    public ProductController(ProductConsumer productConsumer) {
        this.productConsumer = productConsumer;
    }

    @RequestMapping(value = "/skuInfo", method = RequestMethod.GET)
    public SkuInfo skuInfo(@RequestParam("skuId") String skuId) {
        return productConsumer.getSkuInfo(skuId);
    }
}
