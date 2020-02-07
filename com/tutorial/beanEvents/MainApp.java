package com.tutorial.beanEvents;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/tutorial/beanEvents/BeanEvents.xml");
		/**/
		context.start();
		
		HelloBean hellobean = (HelloBean) context.getBean("helloBean");
			hellobean.getMessage();
			
			context.registerShutdownHook(); //ensure that destroy is called
		/**/
		System.out.println();
			
		CustomEventPublisher cvp = (CustomEventPublisher) context.getBean("customEventPublisher");
		
		cvp.publish();
		cvp.publish();
		
		context.stop();
	}
}
