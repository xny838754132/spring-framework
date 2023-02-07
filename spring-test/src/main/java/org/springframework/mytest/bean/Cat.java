package org.springframework.mytest.bean;

import lombok.Data;

/**
 * @author TheNai
 * @date 2023-02-07
 */
@Data
public class Cat {

	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
