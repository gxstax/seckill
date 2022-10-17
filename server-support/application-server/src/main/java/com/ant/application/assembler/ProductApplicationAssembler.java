package com.ant.application.assembler;

import com.ant.facade.application.dto.ProductDTO;
import com.ant.facade.domain.product.entity.Product;
import org.springframework.beans.BeanUtils;

/**
 * <p>
 * product应用转换工具
 * </p>
 *
 * @Author Ant
 * @Date 2022/10/15 17:03
 */
public class ProductApplicationAssembler {

    /**
     * <p>
     * DO 到 DTO 转换
     * </P>
     * 
     * @param product
     * @return ProductDTO
     */
    public static ProductDTO productToDto(Product product) {
        ProductDTO productDTO = new ProductDTO();
        BeanUtils.copyProperties(product, productDTO);
        return productDTO;
    }
}
