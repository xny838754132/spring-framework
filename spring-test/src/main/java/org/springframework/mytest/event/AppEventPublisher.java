package org.springframework.mytest.event;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;
import org.springframework.stereotype.Component;

/**
 * @author TheNai
 * @date 2023-04-13
 */
@Component
public class AppEventPublisher implements ApplicationEventPublisherAware {

	ApplicationEventPublisher eventPublisher;

	public AppEventPublisher() {
		System.out.println("AppEventPublisher.AppEventPublisher");
	}

	@Override
	public void setApplicationEventPublisher(ApplicationEventPublisher applicationEventPublisher) {
		this.eventPublisher = applicationEventPublisher;
	}

	public void publish(ApplicationEvent applicationEvent) {
		eventPublisher.publishEvent(applicationEvent);
	}

	public void publish(Object o) {
		eventPublisher.publishEvent(o);
	}
}
