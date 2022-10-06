package com.ant.service.goods;

import com.ant.domain.Products;
import com.ant.domain.SkuInfo;
import com.ant.manager.CacheManager;
import org.apache.dubbo.config.annotation.Service;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * <p>
 * 商品服务
 * </p>
 *
 * @author Ant
 * @since 2021/10/9 8:30 下午
 */
@DubboS
public class GoodsServiceImpl implements GoodsService {

    @Autowired
    private CacheManager cacheManager;

    /**
     * <p>
     * 查询商品列表
     * </p>
     *
     * @param skuId
     * @return {@link Products}
     */
    @Override
    public SkuInfo activityQuery(String skuId) {
       return cacheManager.getSkuInfo(skuId);
    }

}
