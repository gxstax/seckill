package com.ant;


import com.ant.domain.SkuInfo;

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
     * 根据skuId查询SkuInfo
     * </P>
     *
     * @param skuId
     * @return SkuInfo
     */
    SkuInfo getSkuInfo(String skuId);
}
