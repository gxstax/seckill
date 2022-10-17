package com.ant.facade.domain.product.service;

import com.ant.facade.domain.product.entity.Product;

/**
 * <p>
 * 产品领域服务
 * </p>
 *
 * @Author Ant
 * @Date 2022/10/15 14:15
 */
public interface ProductDomainServiceInterface {
    
    /**
     * <p>
     * 根据 productId 查询 Product
     * </P>
     * 
     * @param productId
     * @return Product
     */
    
    Product findProductById(Long productId);
}
