package org.springframework.mytest.bean;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @author TheNai
 * @date 2023-02-07
 */
@Component
public class Cat implements InitializingBean {

	private String name;

	public String getName() {
		return name;
	}

	@Value("${JAVA_HOME}")
	public void setName(String name) {
		System.out.println("cat..setName 赋值");
		this.name = name;
	}

	public Cat(){
		System.out.println("Cat 被创建");
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("Cat.afterPropertiesSet()");
	}
}