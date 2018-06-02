package com.springbootredis.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {
	/**
	 * io.lettuce.core.RedisCommandTimeoutException: Command timed out
	 * 解决：spring.redis.timeout=5000
	 * @param args
	 */
	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
}
