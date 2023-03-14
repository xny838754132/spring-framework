package org.springframework.mytest.bean;

import org.springframework.beans.factory.FactoryBean;
import org.springframework.stereotype.Component;

/**
 * 工厂 Bean
 * 普通 Bean
 * 区别：
 * 1.Person = 普通 Bean ，注册的组件对象就是Person对象，类型就是Person
 * 2.工厂 Bean = 实现了 FactoryBean 接口的组件。注册的不是 HelloFactory，而是 HelloFactory 这个工厂调用了 getObject() 返回的对象，类型是 getObjectType
 * Mybatis 和 Spring 的整合 SqlSessionFactoryBean
 *
 *  普通的单实例 Bean 保存在 singletonObjects 中
 *  工厂 Bean 保存在 factoryBeanObjectCache 中
 *  如果从容器找找 工厂Bean 每次都会从 factoryBeanObjectCache 中去找到，所以默认工厂 Bean 是单例的
 *
 *  也可以实现 SmartFactoryBean 实现提前加载
 */
@Component
public class HelloFactory implements FactoryBean<Hello> {

	@Override
	public Hello getObject() {
		return new Hello(); // 这是最终获取到的对象
	}

	@Override
	public Class<?> getObjectType() {
		return Hello.class;
	}
}
