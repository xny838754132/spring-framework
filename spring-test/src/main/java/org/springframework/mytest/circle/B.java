package org.springframework.mytest.circle;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author TheNai
 * @date 2023-04-06
 */
@Component
public class B {

	private A a;

	public B() {
		System.out.println("B 构造函数");
	}

	@Autowired
	public void setA(A a) {
		System.out.println("b 自动注入 a");
		this.a = a;
	}

}
