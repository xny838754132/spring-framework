package org.springframework.mytest.processor.bean;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

/**
 * @author TheNai
 * @date 2023-02-22
 */
@Component
public class MyBeanPostProcessor implements BeanPostProcessor {

	public MyBeanPostProcessor() {
		System.out.println("MyBeanPostProcessor");
	}

	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
//		System.out.println("BeanPostProcessor.postProcessBeforeInitialization ... ");
		return BeanPostProcessor.super.postProcessBeforeInitialization(bean, beanName);  // new Object();
	}

	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
//		System.out.println("BeanPostProcessor.postProcessAfterInitialization ... ");
		return BeanPostProcessor.super.postProcessAfterInitialization(bean, beanName);
	}
}
