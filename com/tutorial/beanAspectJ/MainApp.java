package com.tutorial.beanAspectJ;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/tutorial/beanAspectJ/Beans.xml");
	
			InnerClass inner = (InnerClass)context.getBean("inner");
				inner.getMessage();
				try {
				inner.throwException();
				} catch ( Exception ex ){
					
				}	
	}
}
