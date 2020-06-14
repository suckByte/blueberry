package com.blueberry.mytest;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class MyAspect {
	
	@Before(value = "execution(* com.blueberry.mytest.ProductDao.save(..))")
	public void before(JoinPoint joinPoint) {
		System.out.println("前置通知=================" + joinPoint);
	}
	
	@AfterReturning(value = "execution(* com.blueberry.mytest.ProductDao.update(..))", returning = "result")
	public void afterReturning(Object result) {
		System.out.println("后置通知=================" + result);
	}
	
	@After(value = "execution(* com.blueberry.mytest.ProductDao.search(..))")
	public void after() {
		System.out.println("最终通知=================");
	}
	
	@AfterThrowing(value = "execution(* com.blueberry.mytest.ProductDao.delete(..))", throwing = "error")
	public void afterThrowing(Throwable error) {
		System.out.println("异常抛出=================" + error);
	}
}
