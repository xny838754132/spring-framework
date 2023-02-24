package org.springframework.mytest.bean;

import org.jetbrains.annotations.NotNull;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.MessageSource;
import org.springframework.context.MessageSourceAware;

/**
 * Aware 接口：帮我们装配 Spring 底层的一些组件
 * 1、Bean 的功能增强全部是由 BeanPostProcessor + Initialization 合起来完成的
 * 2、骚操作就是 BeanPostProcessor + InitializationBean
 *
 * Person 为什么能把 ApplicationContext 和 MessageSource 当做自己的参数传入进来
 *   - 通过实现接口的方式自动注入了 ApplicationContext 和 MessageSource。 是由 BeanPostProcessor 来完成的
 */
//@Component
public class Person implements ApplicationContextAware, MessageSourceAware {

	//	@Autowired
	private ApplicationContext context; // 可以拿到 IOC 容器

	private MessageSource messageSource;

	private Cat cat;

	@Autowired
	public void setCat(Cat cat) {
		this.cat = cat;
	}

	public Cat getCat() {
		return cat;
	}

	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public ApplicationContext getContext() {
		return context;
	}

	public MessageSource getMessageSource() {
		return messageSource;
	}

	public Person() {
		System.out.println("person创建");
	}

	@Override
	public void setApplicationContext(@NotNull ApplicationContext applicationContext) throws BeansException {
		// 回调机制，把 IOC 容器传入
		this.context = applicationContext;
	}

	@Override
	public void setMessageSource(@NotNull MessageSource messageSource) {
		this.messageSource = messageSource;
	}
}
