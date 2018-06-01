package com.example1.demo3;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.Arrays;

@SpringBootApplication
public class Demo3Application {

	public static void main(String[] args) {
		SpringApplication.run(Demo3Application.class, args);
	}
	public CommandLineRunner commandLineRunner(ApplicationContext context){
		return args -> {
 			String[] beanNames=context.getBeanDefinitionNames();
			Arrays.sort(beanNames);
			System.out.print(beanNames);
		};
	}
}
