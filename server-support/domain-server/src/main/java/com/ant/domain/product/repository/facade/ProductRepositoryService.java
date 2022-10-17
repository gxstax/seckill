package com.ant.domain.product.repository.facade;

import com.ant.domain.product.repository.po.ProductsPO;

/**
 * <p>
 * 产品持久化接口
 * </p>
 *
 * @Author Ant
 * @Date 2022/10/15 11:58
 */
public interface ProductRepositoryService {

    /**
     * <p>
     * 根据产品 Id 查询产品信息
     * </P>
     *
     * @param productId
     * @return ProductsPO
     */
    ProductsPO findProductById(Long productId);
}
