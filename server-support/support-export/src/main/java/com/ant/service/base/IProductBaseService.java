package com.ant.service.base;

import com.ant.domain.SkuInfo;

/**
 * <p>
 * 功能描述
 * </p>
 *
 * @author GaoXin
 * @since 2021/10/19 6:02 下午
 */
public interface IProductBaseService {

    /**
     * <p>
     * 根据商品编号获取商品详细信息
     * </p>
     *
     * @param skuId
     * @return com.ant.domain.SkuInfo
     */
    SkuInfo getSkuInfo(String skuId);

}
