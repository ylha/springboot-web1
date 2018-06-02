package com.example.springtemplates;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication1 {
	/**
	 * springboot集成jdbctemplates访问数据库，需要在资源文件下填写数据库的url，账户密码等
	 * @param args
	 */
	public static void main(String[] args) {
		SpringApplication.run(DemoApplication1.class, args);
	}
}
