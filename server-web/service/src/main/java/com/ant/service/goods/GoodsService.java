package com.ant.service.goods;

import com.ant.domain.Products;

import java.util.List;

/**
 * <p>
 * 商品服务
 * </p>
 *
 * @author Ant
 * @since 2021/10/9 8:30 下午
 */
public interface GoodsService {

    /**
     * <p>
     * 查询商品列表
     * </p>
     *
     * @param no
     * @return {@link Products}
     */
    List<Products> activityQuery(String no);

}
