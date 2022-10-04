package com.ant.service.provider.impl;

import com.ant.domain.SkuInfo;
import com.ant.service.base.IProductBaseService;
import com.ant.service.provider.IProductService;
import org.apache.dubbo.config.annotation.Service;

/**
 * <p>
 * 产品服务实现
 * </p>
 *
 * @author Ant
 * @since 2021/10/19 5:57 下午
 */
@Service
public class ProductServiceImpl implements IProductService {

    private final IProductBaseService productBaseService;

    public ProductServiceImpl(IProductBaseService productBaseService) {
        this.productBaseService = productBaseService;
    }

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
        return productBaseService.getSkuInfo(skuId);
    }

}
