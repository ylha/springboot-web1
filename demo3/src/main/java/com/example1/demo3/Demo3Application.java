package com.example1.demo3;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.Arrays;

@SpringBootApplication
public class Demo3Application {
    /**
     * idea本地仓库的配置 参考：https://blog.csdn.net/gatieme/article/details/50586476
     * 在idea 中创建项目提交github参考博客：https://blog.csdn.net/yanluandai1985/article/details/79805274
     *
     *
     * @param args
     */
	public static void main(String[] args) {
		SpringApplication.run(Demo3Application.class, args);
	}

    /**
     * 打印出所有的bean 主要是因为实现了ApplicationEventPublisherAware 相当于监听器
     * @param context
     * @return
     */
	public CommandLineRunner commandLineRunner(ApplicationContext context){
		return args -> {
 			String[] beanNames=context.getBeanDefinitionNames();
			Arrays.sort(beanNames);
			System.out.print(beanNames);
		};
	}
}
