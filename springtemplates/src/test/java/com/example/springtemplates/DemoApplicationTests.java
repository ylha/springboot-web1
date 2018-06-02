package com.example.springtemplates;




import com.example.springtemplates.com.serveice.CountryServiceImpl;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {
	@Autowired
	private CountryServiceImpl service;
	@Test
	public void contextLoads() {
	}
	//注意加test注解
	@Test
    public void testAdd(){
		int add = service.add(new Country());
		Assert.assertTrue(add>0);
	}
	@Test
	public void testGetList(){
		List<Country> list = service.getList();
		Assert.assertTrue(list.size()>0);
	}
}
