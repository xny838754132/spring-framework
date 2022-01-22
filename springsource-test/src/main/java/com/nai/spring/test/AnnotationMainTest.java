package com.nai.spring.test;

import com.nai.spring.bean.Cat;
import com.nai.spring.bean.Person;
import com.nai.spring.config.MyConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * 注解版Spring的用法
 */
public class AnnotationMainTest {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);
        // Person person = context.getBean(Person.class);
        // System.out.println(person);
        // String[] beanDefinitionNames = context.getBeanDefinitionNames();
        // for (String beanDefinitionName : beanDefinitionNames) {
        //     System.out.println(beanDefinitionName);
        // }
        // Cat bean1 = context.getBean(Cat.class);
        // Cat bean2 = context.getBean(Cat.class);
        // System.out.println(bean1 == bean2);

        Person person = context.getBean(Person.class);
        Cat cat = person.getCat();

        Person person2 = context.getBean(Person.class);
        Cat cat2 = person2.getCat();
        System.out.println(cat == cat2);
    }
}