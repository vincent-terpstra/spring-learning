package com.tutorial.beanLog;

import org.apache.commons.logging.*;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
	static Log log = LogFactory.getLog(MainApp.class.getName());
	
	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/tutorial/beanLog/Beans.xml");
		log.info("Creating HelloSpring Obj");
		Message message = (Message) context.getBean("message");
			message.getMessage1();
			
		log.info("Exiting the program");
	}
}
