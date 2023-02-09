package org.springframework.mytest.bean;

import org.springframework.beans.factory.FactoryBean;

/**
 * 工厂 Bean
 * 普通 Bean
 * 区别：
 * 1.Person = 普通 Bean ，注册的组件对象就是Person对象，类型就是Person
 * 2.工厂 Bean = 实现了 FactoryBean 接口的组件。注册的不是 HelloFactory，而是 HelloFactory 这个工厂调用了 getObject() 返回的对象，类型是 getObjectType
 * Mybatis 和 Spring 的整合 SqlSessionFactoryBean
 */
public class HelloFactory implements FactoryBean<Hello> {

	@Override
	public Hello getObject() throws Exception {
		return new Hello();
	}

	@Override
	public Class<?> getObjectType() {
		return Hello.class;
	}
}
