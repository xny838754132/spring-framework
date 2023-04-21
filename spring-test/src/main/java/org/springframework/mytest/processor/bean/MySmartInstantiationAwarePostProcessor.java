package org.springframework.mytest.processor.bean;

import org.springframework.beans.BeansException;
import org.springframework.beans.PropertyValues;
import org.springframework.beans.factory.config.SmartInstantiationAwareBeanPostProcessor;
import org.springframework.stereotype.Component;

import java.lang.reflect.Constructor;

/**
 * @author TheNai
 * @date 2023-02-22
 */
@Component // bean 进行代理增强期间进行使用
public class MySmartInstantiationAwarePostProcessor implements SmartInstantiationAwareBeanPostProcessor {

	public MySmartInstantiationAwarePostProcessor() {
		System.out.println("MySmartInstantiationAwarePostProcessor");
	}

	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
//		System.out.println("SmartInstantiationAwareBeanPostProcessor.postProcessBeforeInitialization ... ");
		return SmartInstantiationAwareBeanPostProcessor.super.postProcessBeforeInitialization(bean, beanName);
	}

	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
//		System.out.println("SmartInstantiationAwareBeanPostProcessor.postProcessAfterInitialization ... ");
		return SmartInstantiationAwareBeanPostProcessor.super.postProcessAfterInitialization(bean, beanName);
	}

	@Override // 初始化之前进行后置处理，Spring 留给我们这个组件创建对象的回调
	public Object postProcessBeforeInstantiation(Class<?> beanClass, String beanName) throws BeansException {
//		System.out.println("SmartInstantiationAwareBeanPostProcessor.postProcessBeforeInstantiation ...=>> " + beanClass + "--" + beanName);
		// 如果我们自己创建了对象并返回，则不会帮我们再创建对象，而是使用我们自己创建的
		// 我们创建的这个对象，Spring 保存单实例，还是每次创建都来这个方法创建新的实例呢？
		return null;
	}

	@Override
	public boolean postProcessAfterInstantiation(Object bean, String beanName) throws BeansException {
//		System.out.println("SmartInstantiationAwareBeanPostProcessor.postProcessAfterInstantiation ... ");
		return SmartInstantiationAwareBeanPostProcessor.super.postProcessAfterInstantiation(bean, beanName);
	}

	@Override
	public PropertyValues postProcessProperties(PropertyValues pvs, Object bean, String beanName) throws BeansException {
//		System.out.println("SmartInstantiationAwareBeanPostProcessor.postProcessProperties ... ");
		return SmartInstantiationAwareBeanPostProcessor.super.postProcessProperties(pvs, bean, beanName);
	}

	@Override // 预测 Bean 的类型，最后一次改变组件类型
	public Class<?> predictBeanType(Class<?> beanClass, String beanName) throws BeansException {
//		System.out.println("SmartInstantiationAwareBeanPostProcessor.predictBeanType ... ");
		return SmartInstantiationAwareBeanPostProcessor.super.predictBeanType(beanClass, beanName);
	}

	@Override // 返回我们要使用的构造器候选列表
	public Constructor<?>[] determineCandidateConstructors(Class<?> beanClass, String beanName) throws BeansException {
//		System.out.println("SmartInstantiationAwareBeanPostProcessor.determineCandidateConstructors ... ");
		// 返回一个我们指定的构造器
		return SmartInstantiationAwareBeanPostProcessor.super.determineCandidateConstructors(beanClass, beanName);
	}

	@Override // 返回早期的 BeanReference
	public Object getEarlyBeanReference(Object bean, String beanName) throws BeansException {
//		System.out.println("SmartInstantiationAwareBeanPostProcessor.getEarlyBeanReference ... ");
		return SmartInstantiationAwareBeanPostProcessor.super.getEarlyBeanReference(bean, beanName);
	}
}
