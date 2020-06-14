package com.blueberry.mytest;

public class MyAspectXml {

	public void before() {
		System.out.println("前置通知====================");
	}
	
	public void afterThrowing(Throwable error) {
		System.out.println("异常抛出通知================" + error);
	}
}
