package com.springbootmongodb.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner{
	@Autowired
	private CountryRepository countryRepository;
    //mongodb 下载地址 ：http://dl.mongodb.org/dl/win32/x86_64
	//配置 mongodb：http://www.runoob.com/mongodb/mongodb-window-install.html

	/**
	 * com.mongodb.MongoSocketOpenException: Exception opening socket
	 *  确定服务是否启动成功 浏览器访问url localhost
	 *  E11000 duplicate key error collection: springboot-db.country index: _id_ dup key: { : 0 }
	 *  加注解@id
	 * @param args
	 */
	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		countryRepository.deleteAll();
		countryRepository.save(new Country("bj","bj"));
		countryRepository.save(new Country("bj1","bj2"));
		List<Country> all = countryRepository.findAll();
		for (Country c:all){
			System.out.print(c);
		}
		for (Country b : countryRepository.findByCountryname("bj")) {
			System.out.println(b);
		}
	}
}
