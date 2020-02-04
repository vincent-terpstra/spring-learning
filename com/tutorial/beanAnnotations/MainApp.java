package com.tutorial.beanAnnotations;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/tutorial/beanAnnotations/Beans.xml");
	
			OuterClass byName = (OuterClass)context.getBean("outer");
				byName.getMessage();
				byName.getInner();
				
			context.registerShutdownHook();
			
	}
}
