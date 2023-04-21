package org.springframework.mytest.processor.factory;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor;
import org.springframework.stereotype.Component;

/**
 * @author TheNai
 * @date 2023-02-22
 * BeanDefinitionRegistryPostProcessor
 */
@Component
public class MyBeanDefinitionRegistryPostProcessor implements BeanDefinitionRegistryPostProcessor {

	public MyBeanDefinitionRegistryPostProcessor() {
		System.out.println("MyBeanDefinitionBeanFactoryPostProcessor");
	}

	@Override // 随后执行
	public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
//		System.out.println("postProcessBeanFactory");
	}

	@Override // 先执行
	public void postProcessBeanDefinitionRegistry(BeanDefinitionRegistry registry) throws BeansException {
//		System.out.println("postProcessBeanDefinitionRegistry");
		// 增强 Bean  定义信息的注册中心 ， 比如自己注册组件
	}
}
