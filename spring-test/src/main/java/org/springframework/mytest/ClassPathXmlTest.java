package org.springframework.mytest;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.mytest.bean.Cat;

public class ClassPathXmlTest {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("bean2.xml");
		Cat bean = context.getBean(Cat.class);
		System.out.println(bean);
	}
}
