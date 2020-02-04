package com.tutorial.beanDefinition;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("BeanDef.xml");
		/**
			HelloBean hellobean = (HelloBean) context.getBean("helloBean");
			hellobean.getMessage();
			
			context.registerShutdownHook(); //ensure that destroy is called
		/**/
			//Demonstration of singleton & prototype
			HelloBean singleton = (HelloBean) context.getBean("singleton");
				singleton.getMessage(); //Original message
				singleton.setMessage("Changed singleton");
				singleton.getMessage(); //Changed message
			
			HelloBean singleton2 = (HelloBean) context.getBean("singleton");
				singleton2.getMessage(); //Changed message
			
			System.out.println("---");
		/**/
			//Demonstration of singleton & prototype
			HelloBean prototype = (HelloBean) context.getBean("prototype");
				prototype.getMessage(); //Original message
				prototype.setMessage("Changed prototype");
				prototype.getMessage(); //Changed message
				
			HelloBean prototype2 = (HelloBean) context.getBean("prototype");
				prototype2.getMessage(); //Changed message
		/**/
	}
}
