package org.springframework.mytest;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.mytest.bean.Person;

public class ClassPathXmlTest {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
		Person bean = context.getBean(Person.class);
		System.out.println(bean.getName());
	}
}
