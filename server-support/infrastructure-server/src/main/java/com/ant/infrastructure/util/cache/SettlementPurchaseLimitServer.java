package com.ant.infrastructure.util.cache;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.redisson.api.RScript;
import org.redisson.api.RedissonClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

/**
 * <p>
 * 结算下单限购服务
 * </p>
 *
 * @Author Ant
 * @Date 2022/10/18 19:45
 */
@Service
public class SettlementPurchaseLimitServer {

    Logger logger = LogManager.getLogger(SettlementPurchaseLimitServer.class);

    @Autowired
    private RedisCache redisCache;

    /**
     * lua逻辑：首先判断活动库存是否存在，以及库存余量是否够本次购买数量，如果不够，则返回0，如果够则完成扣减并返回1
     * 两个入参，KEYS[1] : 活动库存的key
     *         KEYS[2] : 活动库存的扣减数量
     */
    private String STORE_DEDUCTION_SCRIPT_LUA =
            "local c_s = redis.call('get', KEYS[1])\n" +
                    "if not c_s or tonumber(c_s) < tonumber(KEYS[2]) then\n" +
                    "return 0\n" +
                    "end\n" +
                    "redis.call('decrby',KEYS[1], KEYS[2])\n" +
                    "return 1";

    /**
     * 在系统启动时，将脚本预加载到Redis中，并返回一个加密的字符串，下次只要传该加密窜，即可执行对应脚本，减少了Redis的预编译
     */
    private String STORE_DEDUCTION_SCRIPT_SHA1 = "";

    @PostConstruct
    public void init(){
        String sha1 = redisCache.scriptLoad(STORE_DEDUCTION_SCRIPT_LUA);
        logger.info("生成的sha1：" + sha1);
        STORE_DEDUCTION_SCRIPT_SHA1 = sha1;
    }


    /**
     * <p>
     * 限购条件校验
     * </P>
     *
     * @param key    库存key
     * @param buyNum 购买数量
     * @return Boolean
     */
//    @Override
//    public Boolean purchaseLimitCheck(String key, String buyNum) {
//        try (Jedis jedis = jedisPool.getResource()) {
//            Object obj = jedis.evalsha(STORE_DEDUCTION_SCRIPT_SHA1,2,key,buyNum);
//            //脚本中返回的结果是0或1，表示失败或者成功
//            return (Long)obj == 1L;
//        }
//    }

    /**
     * <p>
     * 设置秒杀商品库存缓存
     * </P>
     *
     * @param key   库存Key
     * @param value 库存数量
     * @return Boolean
     */
//    @Override
//    public Boolean setProductStore(String key, String value) {
//        try (Jedis jedis = jedisPool.getResource()) {
//            jedis.set(key, value);
//            return Boolean.TRUE;
//        } catch (Exception e) {
//            return Boolean.FALSE;
//        }
//    }

}
