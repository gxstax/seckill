package com.ant.application;

import com.ant.application.assembler.ProductApplicationAssembler;
import com.ant.facade.application.ProductApplicationService;
import com.ant.facade.application.dto.ProductDTO;
import com.ant.facade.domain.product.entity.Product;
import com.ant.facade.domain.product.service.ProductDomainServiceInterface;
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
public class ProductApplicationApplicationService implements ProductApplicationService {

    Logger logger = LoggerFactory.getLogger(ProductApplicationApplicationService.class);

    @DubboReference
    private ProductDomainServiceInterface productDomainServiceInterface;


    @Override
    public ProductDTO findProductById(Long productId) {
        logger.info("[Application-Server]-findProductById请求，入参productId[{}]", productId);
        Product product = productDomainServiceInterface.findProductById(productId);
        return ProductApplicationAssembler.productToDto(product);
    }
}
