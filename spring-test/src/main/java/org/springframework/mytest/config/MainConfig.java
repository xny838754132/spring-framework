package org.springframework.mytest.config;

import jakarta.annotation.Resource;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.BeanNameGenerator;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.type.AnnotationMetadata;
import org.springframework.mytest.bean.Cat;

/**
 * @author TheNai
 * @date 2023-03-08
 */
@Configuration
@ComponentScan("org.springframework.mytest")
public class MainConfig {

	@Resource
	private ApplicationEventPublisher applicationEventPublisher;

	public MainConfig() {
		System.out.println("MainConfig ==> 创建了");
	}

	static class MyImportRegistrar implements ImportBeanDefinitionRegistrar {
		@Override
		public void registerBeanDefinitions(AnnotationMetadata importingClassMetadata, BeanDefinitionRegistry registry, BeanNameGenerator importBeanNameGenerator) {
//			Enhancer enhancer = new Enhancer();
//			enhancer.setCallback(new MethodInterceptor() {
//				@Override
//				public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
//					return null;
//				}
//			});
//			enhancer.setSuperclass(HelloService.class);

			RootBeanDefinition rootBeanDefinition = new RootBeanDefinition();
			rootBeanDefinition.setBeanClass(Cat.class);
			registry.registerBeanDefinition("tomCat", rootBeanDefinition);
		}
	}
}
