package com.blueberry.mytest;

public class MyAspectXml {

	public void before() {
		System.out.println("ǰ��֪ͨ====================");
	}
	
	public void afterThrowing(Throwable error) {
		System.out.println("�����׳�================" + error);
	}
}
