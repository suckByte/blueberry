package com.blueberry.mytest;

import java.lang.reflect.Method;

import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

public class MyCglib implements MethodInterceptor{

	private StudentDao users;
	
	public MyCglib(StudentDao users) {
		this.users = users;
	}
	
	public Object createProxy() {
		Enhancer enhancer = new Enhancer();
		enhancer.setSuperclass(users.getClass());
		enhancer.setCallback(this);
		Object proxy = enhancer.create();
		return proxy;
	}

	@Override
	public Object intercept(Object proxy, Method method, Object[] args, MethodProxy methodProxy) throws Throwable {
		// TODO Auto-generated method stub
		if("save".equals(method.getName())) {
			System.out.println("权限校验");
			return methodProxy.invokeSuper(proxy, args);
		}
		return methodProxy.invokeSuper(proxy, args);
	}
}
