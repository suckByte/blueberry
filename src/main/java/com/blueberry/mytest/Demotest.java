package com.blueberry.mytest;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")

public class Demotest {
	
	@Resource(name = "proxyFactoryBean")
	private StudentDao studentDao;
	
//	@Resource(name = "customDaoProxy")
//	private CustomDao customDao;
	
//	@Test
//	public void test1() {
//		studentDao.Save();
//		studentDao.Delete();
//		studentDao.Update();
//		studentDao.Find();
//	}
	
//	@Test
//	public void test2() {
//		customDao.Save();
//		customDao.Delete();
//		customDao.Update();
//		customDao.Find();
//	}
	
//	@Resource(name = "productDao")
//	private ProductDao productDao;
//	
//	@Test
//	public void test3() {
//		productDao.delete();
//		productDao.save();
//		productDao.update();
//		productDao.search();
//	}
//	
	@Resource(name = "categoryDao")
	private CategoryDao categoryDao;
	
	@Test
	public void test4() {
		categoryDao.Delete();
		categoryDao.save();
		categoryDao.Update();
		categoryDao.Find();
	}
}
