package com.nai.spring.config;

import com.nai.spring.bean.Cat;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.BeanNameGenerator;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.type.AnnotationMetadata;

/**
 * BeanDefinitionRegistrar: Bean定义信息配置中心
 */
// @Import({MyConfig.ImportRegister.class})
@ComponentScan("com.nai.spring")
@Configuration
public class MyConfig {

    // @Bean
    // public Person person() {
    //     Person person = new Person();
    //     person.setName("张三");
    //     return person;
    // }

    public static class ImportRegister implements ImportBeanDefinitionRegistrar {
        @Override
        public void registerBeanDefinitions(AnnotationMetadata importingClassMetadata,
                                            BeanDefinitionRegistry registry,
                                            BeanNameGenerator importBeanNameGenerator) {
            // BeanDefinition
            RootBeanDefinition catDefinition = new RootBeanDefinition();
            catDefinition.setBeanClass(Cat.class);
            // 可以声明定义信息,包括我需要自动装配什么
            // 定义这个实例的类型,名字
            registry.registerBeanDefinition("tomcat", catDefinition);
        }
    }
}