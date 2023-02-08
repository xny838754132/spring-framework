package org.springframework.mytest.bean;

import org.springframework.stereotype.Component;

/**
 * @author TheNai
 * @date 2023-02-07
 */
@Component
public class Cat {

	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
