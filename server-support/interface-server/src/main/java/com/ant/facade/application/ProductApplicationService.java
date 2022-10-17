package com.ant.facade.application;

import com.ant.facade.application.dto.ProductDTO;
import com.ant.facade.domain.product.entity.Product;

/**
 * <p>
 * 商品服务
 * </p>
 *
 * @Author Ant
 * @Date 2022/10/14 17:20
 */
public interface ProductApplicationService {
    ProductDTO findProductById(Long productId);
}
