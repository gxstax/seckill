package com.ant.infrastructure.util.cache;

import com.ant.InfrastructureServerApplication;
import com.google.common.collect.Lists;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.redisson.api.RBucket;
import org.redisson.api.RScript;
import org.redisson.api.RedissonClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.List;

/**
 * <p>
 *
 * </p>
 *
 * @Author Ant
 * @Date 2022/10/19 00:58
 */
@SpringBootTest
@RunWith(SpringRunner.class)
public class RedisCacheTest {

    private String STORE_DEDUCTION_SCRIPT_LUA =
            "local c_s = redis.call('get', KEYS[1])\n" +
                    "if not c_s or tonumber(2) < tonumber(1) then\n" +
                    "return 0\n" +
                    "end\n" +
                    "redis.call('decrby',KEYS[1], ARGV[1])\n" +
                    "return 1";

    @Autowired
    private RedissonClient redissonClient;

    @Test
    public void contextLoads() {

        RScript script = redissonClient.getScript();
        String sha1 = script.scriptLoad(STORE_DEDUCTION_SCRIPT_LUA);
        System.out.println(sha1);

        List<Object> keys=new ArrayList<>();
        keys.add("store1");
        Long result = script.evalSha(RScript.Mode.READ_WRITE,
                sha1,
                RScript.ReturnType.INTEGER,
                keys, Lists.newArrayList(1L).toArray());

        System.out.println(result);

    }
}
