package com.ant.domain.product.repository.persistence;

import com.ant.domain.product.repository.entity.Products;
import com.ant.domain.product.repository.facade.ProductRepositoryInterface;
import com.ant.domain.product.repository.mapper.ProductsMapper;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 商品仓储实现
 * </p>
 *
 * @author Ant
 * @since 2021/11/25 3:06 下午
 */
@Service
public class ProductRepositoryImpl implements ProductRepositoryInterface {

    private final ProductsMapper productsMapper;

    public ProductRepositoryImpl(ProductsMapper productsMapper) {
        this.productsMapper = productsMapper;
    }

    @Override
    public Products getProductById(Long id) {
        return productsMapper.selectProduct(id);
    }
}
