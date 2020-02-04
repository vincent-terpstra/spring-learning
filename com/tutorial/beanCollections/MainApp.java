package com.tutorial.beanCollections;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/tutorial/beanCollections/BeanCollection.xml");
		
		
		/**/
		JavaCollection jc = (JavaCollection) context.getBean("javaCollection");
			jc.getAddressList();
			jc.getAddressMap();
			jc.getAddressProp();
			jc.getAddressSet();
		
	}
}
