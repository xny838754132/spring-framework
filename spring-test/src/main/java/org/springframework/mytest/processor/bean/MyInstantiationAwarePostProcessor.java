package org.springframework.mytest.processor.bean;

import org.springframework.beans.BeansException;
import org.springframework.beans.PropertyValues;
import org.springframework.beans.factory.config.InstantiationAwareBeanPostProcessor;
import org.springframework.stereotype.Component;

/**
 * @author TheNai
 * @date 2023-02-22
 */
@Component
public class MyInstantiationAwarePostProcessor implements InstantiationAwareBeanPostProcessor {

	public MyInstantiationAwarePostProcessor() {
		System.out.println("MyInstantiationAwarePostProcessor");
	}

	@Override // 初始化之前改变对象类型
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("InstantiationAwareBeanPostProcessor.postProcessBeforeInitialization ... ");
		return null;
	}

	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("InstantiationAwareBeanPostProcessor.postProcessAfterInitialization ... ");
		return null;
	}

	@Override
	public Object postProcessBeforeInstantiation(Class<?> beanClass, String beanName) throws BeansException {
		System.out.println("InstantiationAwareBeanPostProcessor.postProcessBeforeInstantiation ... ");
		return null;
	}

	@Override
	public boolean postProcessAfterInstantiation(Object bean, String beanName) throws BeansException {
		System.out.println("InstantiationAwareBeanPostProcessor.postProcessAfterInstantiation ...==> " + bean + "--" + beanName);

		return true; // 返回 false ，则 Bean的赋值全部结束
	}

	@Override // 解析自定义注解 进行属性注入 ；pvs 封装了所有的属性信息
	public PropertyValues postProcessProperties(PropertyValues pvs, Object bean, String beanName) throws BeansException {
		System.out.println("InstantiationAwareBeanPostProcessor.postProcessProperties ... ");
		return null;
	}
}
