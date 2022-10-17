package com.ant.interfaces.application;

import com.ant.interfaces.application.dto.ProductDTO;

/**
 * <p>
 * 商品服务
 * </p>
 *
 * @Author Ant
 * @Date 2022/10/14 17:20
 */
public interface ProductApplicationInterface {
    ProductDTO findProductById(Long productId);
}
