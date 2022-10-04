package com.ant.service.base.impl;

import com.ant.domain.SkuInfo;
import com.ant.service.base.IProductBaseService;
import org.apache.dubbo.config.annotation.Service;

/**
 * <p>
 * 商品服务实现
 * </p>
 *
 * @author Ant
 * @since 2021/10/19 6:03 下午
 */
@Service
public class ProductBaseServiceImpl implements IProductBaseService {

    /**
     * <p>
     * 根据商品编号获取商品详细信息
     * </p>
     *
     * @param skuId
     * @return {@link SkuInfo}
     */
    @Override
    public SkuInfo getSkuInfo(String skuId) {
        return new SkuInfo(1L, "00001", "SKU-00001");
    }

}
