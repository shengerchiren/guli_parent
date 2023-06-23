package com.liaoyu.service_edu;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.core.ValueOperations;

@SpringBootTest
public class ServiceEduTest {

    @Autowired
    private StringRedisTemplate stringRedisTemplate;
    @Test
    public void test1(){
        ValueOperations<String, String> ops = stringRedisTemplate.opsForValue();
        ops.set("name1","张三");
        System.out.println(ops.get("name"));
    }

}
