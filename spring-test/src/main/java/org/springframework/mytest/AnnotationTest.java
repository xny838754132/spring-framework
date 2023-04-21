package org.springframework.mytest;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.mytest.aop.HelloService;
import org.springframework.mytest.circle.A;
import org.springframework.mytest.config.AopOpenConfig;
import org.springframework.mytest.config.MainConfig;
import org.springframework.mytest.event.AppEventPublisher;
import org.springframework.mytest.event.ChangeEvent;
import org.springframework.mytest.event.MessageEvent;

/**
 * @author TheNai
 * @date 2023-02-06
 */
public class AnnotationTest {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(MainConfig.class, AopOpenConfig.class);
//		Hello bean = context.getBean(Hello.class);
//		Hello bean2 = context.getBean(Hello.class);
//		System.out.println(bean == bean2);

		HelloService helloService = context.getBean(HelloService.class);
		// 代理对象调用方法
		helloService.sayHello("张三");
//		context.publishEvent();
		AppEventPublisher eventPublisher = context.getBean(AppEventPublisher.class);
		eventPublisher.publish(new A());
		eventPublisher.publish(new MessageEvent("hello 你好"));
		eventPublisher.publish(new ChangeEvent(eventPublisher, "sending..."));
	}
}
