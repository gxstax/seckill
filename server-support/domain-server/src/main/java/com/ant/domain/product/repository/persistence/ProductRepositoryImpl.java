package com.ant.domain.product.repository.persistence;

import com.ant.domain.product.repository.facade.ProductRepositoryInterface;
import com.ant.domain.product.repository.mapper.ProductsDao;
import com.ant.domain.product.repository.po.ProductsPO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.Optional;

/**
 * <p>
 * product 持久化实现
 * </p>
 *
 * @Author Ant
 * @Date 2022/10/15 11:58
 */
@Repository
public class ProductRepositoryImpl implements ProductRepositoryInterface {

    @Autowired
    private ProductsDao productsDao;

    /**
     * <p>
     * 根据产品 Id 查询产品信息
     * </P>
     *
     * @param productId 产品ID
     * @return ProductsPO
     */
    @Override
    public ProductsPO findProductById(Long productId) {
        return productsDao.findById(productId)
                .orElseThrow(() -> new RuntimeException("leave not found"));
    }

}
