package org.springframework.mytest.event;

import org.springframework.context.ApplicationEvent;

import java.io.Serial;
import java.io.Serializable;
import java.util.StringJoiner;

/**
 * @author TheNai
 * @date 2023-04-13
 */
public class MessageEvent extends ApplicationEvent implements Serializable {

	@Serial
	private static final long serialVersionUID = 1L;

	public MessageEvent(Object source) {
		super(source);
	}

	@Override
	public String toString() {
		return new StringJoiner(", ", MessageEvent.class.getSimpleName() + "[", "]")
				.add("source=" + source)
				.toString();
	}
}
