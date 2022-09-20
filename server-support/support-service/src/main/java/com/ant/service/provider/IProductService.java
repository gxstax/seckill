package com.ant.service.provider;

import com.ant.domain.SkuInfo;

/**
 * <p>
 * 产品服务接口
 * </p>
 *
 * @author GaoXin
 * @since 2021/10/19 5:55 下午
 */
public interface IProductService {

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
