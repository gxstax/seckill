package com.ant.domain.product.repository.facade;

import com.ant.domain.product.repository.entity.Products;

/**
 * <p>
 * 商品仓储接口
 * </p>
 *
 * @author Ant
 * @since 2021/11/25 3:06 下午
 */
public interface ProductRepositoryInterface {

    /**
     * 根据ID查询商品信息
     * @param id
     * @return
     */
    Products getProductById(Long id);
}
