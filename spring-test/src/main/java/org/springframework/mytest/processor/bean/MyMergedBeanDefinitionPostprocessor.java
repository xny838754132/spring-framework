package org.springframework.mytest.processor.bean;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.support.MergedBeanDefinitionPostProcessor;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.stereotype.Component;

/**
 * @author TheNai
 * @date 2023-02-22
 */
@Component
public class MyMergedBeanDefinitionPostprocessor implements MergedBeanDefinitionPostProcessor {

	public MyMergedBeanDefinitionPostprocessor() {
		System.out.println("MyMergedBeanDefinitionPostprocessor");
	}

	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("postProcessBeforeInitialization ...");
		return MergedBeanDefinitionPostProcessor.super.postProcessBeforeInitialization(bean, beanName);
	}

	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("postProcessAfterInitialization ...");
		return MergedBeanDefinitionPostProcessor.super.postProcessAfterInitialization(bean, beanName);
	}

	@Override // 对象创建完后，可以再修改 BeanDefinition
	public void postProcessMergedBeanDefinition(RootBeanDefinition beanDefinition, Class<?> beanType, String beanName) {
		System.out.println("postProcessMergedBeanDefinition ...");
	}

	@Override
	public void resetBeanDefinition(String beanName) {
		System.out.println("resetBeanDefinition ...");
		MergedBeanDefinitionPostProcessor.super.resetBeanDefinition(beanName);
	}
}
