package com.ant.application;

import com.ant.application.assembler.ProductApplicationAssembler;
import com.ant.interfaces.application.ProductApplicationInterface;
import com.ant.interfaces.application.dto.ProductDTO;
import com.ant.interfaces.domain.product.entity.Product;
import com.ant.interfaces.domain.product.service.ProductDomainInterface;
import org.apache.dubbo.config.annotation.DubboReference;
import org.apache.dubbo.config.annotation.DubboService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * <p>
 * 商品应用层服务
 * </p>
 *
 * @Author Ant
 * @Date 2022/10/14 17:24
 */
@DubboService
public class ProductApplicationServer implements ProductApplicationInterface {

    Logger logger = LoggerFactory.getLogger(ProductApplicationServer.class);

    @DubboReference
    private ProductDomainInterface productDomainInterface;


    @Override
    public ProductDTO findProductById(Long productId) {
        logger.info("[Application-Server]-findProductById请求，入参productId[{}]", productId);
        Product product = productDomainInterface.findProductById(productId);
        return ProductApplicationAssembler.productToDto(product);
    }
}
