package org.springframework.mytest;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.mytest.bean.Cat;

/**
 * @author TheNai
 * @date 2023-02-07
 */
public class XMlTest {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		Cat cat = context.getBean(Cat.class);
		System.out.println(cat.getName());
	}
}
