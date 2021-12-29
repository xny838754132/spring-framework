package com.nai.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("bean.xml");
		A a = applicationContext.getBean(A.class);
		System.out.println(a.getClass());
	}

}