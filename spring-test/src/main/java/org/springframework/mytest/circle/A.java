package org.springframework.mytest.circle;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author TheNai
 * @date 2023-04-06
 * 肯定能成功
 */
@Component
public class A {

	private B b;

	public A() {
		System.out.println("A 构造");
	}

	@Autowired
	public void setB(B b) {
		System.out.println("a 自动注入 b");
		this.b = b;
	}
}
