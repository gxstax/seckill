package com.ant.domain.product.assembler;

import com.ant.domain.product.repository.po.ProductsPO;
import com.ant.facade.domain.product.entity.Product;
import org.springframework.beans.BeanUtils;

/**
 * <p>
 * ProductDomainAssembler
 * </p>
 *
 * @Author Ant
 * @Date 2022/10/15 14:28
 */
public class ProductDomainAssembler {

    public static Product productsPoToEntity(ProductsPO productsPO) {
        Product product = new Product();
        BeanUtils.copyProperties(productsPO, product);
        return product;
    }
}
