package com.nai.test;

import org.springframework.context.ApplicationContext;

public class Test {
	public static void main(String[] args) {
		ApplicationContext applicationContext = new MyClassPathXmlApplicationContext("bean.xml");
		A a = applicationContext.getBean(A.class);
		System.out.println(a.getClass());
	}

}