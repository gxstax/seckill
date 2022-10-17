package com.ant.domain.product.repository.mapper;

import com.ant.domain.product.repository.po.ProductsPO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.io.Serializable;

/**
 * <p>
 *
 * </p>
 *
 * @Author Ant
 * @Date 2022/10/15 11:24
 */
public interface ProductsDao extends JpaRepository<ProductsPO, Long>, Serializable {

}
