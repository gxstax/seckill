package com.ant.service.goods;

import com.ant.domain.Goods;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.Map;

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
     * @return {@link Goods}
     */
    List<Goods> activityQuery(String no);

}
