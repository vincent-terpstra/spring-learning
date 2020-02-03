package com.tutorial;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
		
		/**/
		//HelloWorld objA = (HelloWorld) context.getBean("helloWorld");
		//objA.getMessage();
		
		ChildBean child = (ChildBean) context.getBean("childBean");
		child.getMessage();
		child.getMessage2();
	
		
		/**
		ConstructorDI constr = (ConstructorDI) context.getBean("constructor");
		constr.message();
		
		/**
		HelloWorld objA = (HelloWorld) context.getBean("helloWorld");
		objA.getMessage();
		
		context.registerShutdownHook();
		/**/
	}
}
