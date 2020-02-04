package com.tutorial.beanAutowiring;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/tutorial/beanAutowiring/Beans.xml");
	
			OuterClass byName = (OuterClass)context.getBean("byName");
				byName.getMessage();
				byName.getInner();
				
			System.out.println();
			
			OuterClass byType = (OuterClass)context.getBean("byType");
				byType.getMessage();
				byType.getInner();
				
			System.out.println();
			
			OuterClass byConstructor = (OuterClass)context.getBean("byConstructor");
				byConstructor.getMessage();
				byConstructor.getInner();
		
	}
}
