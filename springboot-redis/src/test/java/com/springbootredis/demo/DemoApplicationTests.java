package com.springbootredis.demo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {
	@Autowired
    StringRedisTemplate redisTemplate;
	@Test
	public void contextLoads() {
	}
	@Test
    public void testSetValue(){

		redisTemplate.opsForValue().set("aaaa","a");

	}
	@Test
	public void getValue(){
		String a=redisTemplate.opsForValue().get("aaaa");
		System.out.print(a);
	}
}
