package org.springframework.mytest;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.mytest.bean.Person;

/**
 * @author TheNai
 * @date 2023-02-06
 */
public class AnnotationTest {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext("org.springframework.mytest.bean");
		Person bean = context.getBean(Person.class);
		ApplicationContext beanContext = bean.getContext();
		System.out.println(context == beanContext);
	}
}
