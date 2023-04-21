package org.springframework.mytest.event;

import org.springframework.context.ApplicationEvent;

import java.io.Serial;
import java.io.Serializable;
import java.util.StringJoiner;

/**
 * @author TheNai
 * @date 2023-04-13
 */
public class ChangeEvent extends ApplicationEvent implements Serializable {

	@Serial
	private static final long serialVersionUID = 1L;

	private String state;

	public ChangeEvent(Object source) {
		super(source);
	}

	public ChangeEvent(Object source, String state) {
		super(source);
		this.state = state;
	}

	public String getState() {
		return state;
	}

	@Override
	public String toString() {
		return new StringJoiner(", ", ChangeEvent.class.getSimpleName() + "[", "]")
				.add("state='" + state + "'")
				.add("source=" + source)
				.toString();
	}
}
