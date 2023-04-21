package org.springframework.mytest.aop;

import org.springframework.stereotype.Component;

/**
 * @author TheNai
 * @date 2023-04-07
 */
@Component // 切面存在的话就要返回代理对象
public class HelloService {

	public HelloService() {
		System.out.println("helloService");
	}

	public String sayHello(String name) {
		String result = "你好：" + name;
		System.out.println(result);
		int length = name.length();
		return result + "---" + length;
	}
}
