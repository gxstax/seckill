package com.ant.provider;


import com.ant.ProductService;
import com.ant.domain.SkuInfo;
import com.ant.domain.dto.ProductDetailDTO;
import org.apache.dubbo.config.annotation.DubboService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * <p>
 *  ProductService Provider
 * </p>
 *
 * @author Ant
 * @date 2022/10/05 01:13
 */
@DubboService
public class ProductServiceImpl implements ProductService {

    private static final Logger logger = LoggerFactory.getLogger(ProductServiceImpl.class);

    /**
     * <p>
     * 根据 productId 查询商品详情信息
     * </P>
     *
     * @param productId 商品ID
     * @return ProductDetailDTO
     */
    @Override
    public ProductDetailDTO getProductDetail(String productId) {
        logger.info("查询ProductDetailDTO-productId[{}]", productId);
        return new ProductDetailDTO().mock();
    }

    @Override
    public SkuInfo getSkuInfo(String skuId) {
        logger.info("[秒杀服务]-查询SkuInfo-params[{}]", skuId);
        return new SkuInfo(skuId);
    }
}
