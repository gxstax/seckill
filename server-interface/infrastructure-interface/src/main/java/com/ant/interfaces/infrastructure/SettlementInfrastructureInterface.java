package com.ant.interfaces.infrastructure;

/**
 * <p>
 *
 * </p>
 *
 * @Author Ant
 * @Date 2022/10/18 19:37
 */
public interface SettlementInfrastructureInterface {

    /**
     * <p>
     * 限购条件校验
     * </P>
     *
     * @param key       库存Key
     * @param buyNum    购买数量
     * @return Boolean
     */
    Boolean purchaseLimitCheck(String key, String buyNum);
    
    /**
     * <p>
     * 设置秒杀商品库存缓存
     * </P>
     * 
     * @param key       库存Key
     * @param value     库存数量
     * @return Boolean
     */
    Boolean setProductStore(String key,String value);
}
