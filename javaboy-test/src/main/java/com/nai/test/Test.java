package com.nai.test;

import com.nai.bean.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("bean.xml");
		User user = applicationContext.getBean(User.class);
		System.out.println(user.getUsername());
	}

}