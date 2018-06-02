package com.springbootjpa.demo;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;
import java.util.Optional;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {
	@Autowired
	private CountryDao dao;
	@Test
	public void contextLoads() {

	}
	@Test
	public void  testFindAll(){
		List<Country> all = dao.findAll();
		Assert.assertTrue(all.size()>0);
	}
	@Test
    public void testfindone(){
		/*Country c =new Country();
		c.setId(1);*/
		Optional<Country> byId = dao.findById((long) 1);
        Assert.assertTrue(byId.get().getId()>0);
	}
}
