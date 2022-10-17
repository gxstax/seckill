package com.ant.domain.product.service;

import com.ant.domain.product.repository.facade.ProductRepositoryInterface;
import com.ant.domain.product.repository.po.ProductsPO;
import com.ant.facade.domain.product.entity.Product;
import com.ant.facade.domain.product.service.ProductDomainServiceInterface;
import lombok.extern.slf4j.Slf4j;
import org.apache.dubbo.config.annotation.DubboService;
import com.ant.domain.product.assembler.ProductDomainAssembler;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * <p>
 * 产品领域服务
 * </p>
 *
 * @Author Ant
 * @Date 2022/10/15 12:18
 */
@Slf4j
@DubboService
public class ProductDomainService implements ProductDomainServiceInterface {

    Logger logger = LoggerFactory.getLogger(ProductDomainService.class);

    private final ProductRepositoryInterface productRepositoryInterface;

    public ProductDomainService(ProductRepositoryInterface productRepositoryInterface) {
        this.productRepositoryInterface = productRepositoryInterface;
    }

    /**
     * <p>
     * 根据 productId 查询 Product
     * </P>
     *
     * @param productId
     * @return Product
     */
    @Override
    public Product findProductById(Long productId) {
        logger.info("[Domain-Server]-findProductById请求，入参productId[{}]", productId);
        ProductsPO productsPO = productRepositoryInterface.findProductById(productId);
        logger.info("[Domain-Server]-findProductById请求，结果productsPO[{}]", productsPO);
        return ProductDomainAssembler.productsPoToEntity(productsPO);
    }
}
