package org.springframework.mytest;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.mytest.bean.Hello;
import org.springframework.mytest.config.MainConfig;

/**
 * @author TheNai
 * @date 2023-02-06
 */
public class AnnotationTest {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(MainConfig.class);
		Hello bean = context.getBean(Hello.class);
		Hello bean2 = context.getBean(Hello.class);
		System.out.println(bean == bean2);
	}
}
