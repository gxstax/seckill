package com.ant.domain.product.repository.mapper;

import com.ant.domain.product.repository.entity.Products;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface ProductsMapper {

    @Select("select id,name from products where id=#{id}")
    Products selectProduct(Long id);

}
