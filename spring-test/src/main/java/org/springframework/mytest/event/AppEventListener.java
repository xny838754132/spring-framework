package org.springframework.mytest.event;

import org.springframework.context.PayloadApplicationEvent;
import org.springframework.context.event.EventListener;
import org.springframework.mytest.circle.A;
import org.springframework.stereotype.Component;

/**
 * @author TheNai
 * @date 2023-04-13
 */
@Component
public class AppEventListener {

	public static void main(String[] args) {
		System.out.println(System.getenv());
	}

	public AppEventListener() {
		System.out.println("AppEventListener.AppEventListener");
	}

	@EventListener(MessageEvent.class) // 监听事件
	public void listenMessage(MessageEvent event) {
		System.out.println("Message事件到达..." + event + "；已发送邮件....");
	}


	@EventListener(ChangeEvent.class)
	public void listenChange(ChangeEvent event) {
		System.out.println("Change事件到达..." + event + "；已同步状态....");
	}

	@EventListener(PayloadApplicationEvent.class)
	public void listenPayload(PayloadApplicationEvent<A> event) {
		System.out.println("Payload事件到达..." + event.getPayload() + "；已进行处理....");
	}

}
