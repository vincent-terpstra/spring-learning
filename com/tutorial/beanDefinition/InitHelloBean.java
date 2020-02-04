package com.tutorial.beanDefinition;

import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.beans.BeansException;
/**
 * Allows logic before and after a bean is initialized
 * Run as Main()
 * @author vincent
 */
public class InitHelloBean implements BeanPostProcessor {
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("BeforeInitialization : " + beanName);
		return bean; //OR any other object
	}
	
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("AfterInitialization : " + beanName);
		return bean; //OR any other object
	}
	
	//Run to test
	public static void main(String[] args){
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("BeanInit.xml");
		/**/
		HelloBean hellobean = (HelloBean) context.getBean("helloBean");
		hellobean.getMessage();
		
		context.registerShutdownHook(); //ensure that destroy is called
		/**/
	}
}
