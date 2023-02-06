package org.springframework.mytest.bean;

import org.springframework.stereotype.Service;

/**
 * @author TheNai
 * @date 2023-02-06
 */
@Service
public class TestService {

	public void printHello() {
		System.out.println("hello world");
	}
}
