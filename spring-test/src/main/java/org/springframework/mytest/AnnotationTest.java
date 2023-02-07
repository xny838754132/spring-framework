package org.springframework.mytest;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.mytest.bean.TestService;

/**
 * @author TheNai
 * @date 2023-02-06
 */
public class AnnotationTest {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext("org.springframework.mytest.bean");
		TestService bean = context.getBean(TestService.class);
		bean.printHello();
	}
}
