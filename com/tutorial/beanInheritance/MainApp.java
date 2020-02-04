package com.tutorial.beanInheritance;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("BeanTriple.xml");
		TripleMessage triple = (TripleMessage) context.getBean("tripleBean");
			triple.getMessage1();
			triple.getMessage2();
			triple.getMessage3();
	}
}
