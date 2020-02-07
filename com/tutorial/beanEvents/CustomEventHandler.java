package com.tutorial.beanEvents;

import org.springframework.context.ApplicationListener;

public class CustomEventHandler implements ApplicationListener<CustomEvent> {

	@Override
	public void onApplicationEvent(CustomEvent event) {
		System.out.println("Handled : " + event);
	}

}
