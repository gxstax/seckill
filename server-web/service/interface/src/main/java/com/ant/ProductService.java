package com.ant;


import com.ant.domain.SkuInfo;
import com.ant.domain.dto.ProductDetailDTO;

/**
 * <p>
 * 商品服务
 * </p>
 *
 * @author Ant
 * @date 2022/10/05 01:03
 */
public interface ProductService {

    /**
     * <p>
     * 根据 productId 查询商品详情信息
     * </P>
     * 
     * @param productId 商品ID
     * @return ProductDetailDTO
     */
    ProductDetailDTO getProductDetail(String productId);

    /**
     * <p>
     * 根据skuId查询SkuInfo
     * </P>
     *
     * @param skuId
     * @return SkuInfo
     */
    SkuInfo getSkuInfo(String skuId);
}
