package com.nai.spring.test;

import com.nai.spring.bean.Person;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainTest {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		Person bean = context.getBean(Person.class);
		System.out.println(bean);
	}
}
