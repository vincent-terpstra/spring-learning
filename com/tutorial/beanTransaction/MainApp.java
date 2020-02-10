package com.tutorial.beanTransaction;

import java.util.List;

import org.apache.commons.logging.*;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
	static Log log = LogFactory.getLog(MainApp.class.getName());
	
	public static void main(String[] args) {
		AbstractApplicationContext context = 
		new ClassPathXmlApplicationContext("com/tutorial/beanTransaction/Beans.xml");
		
		StudentDAO template = (StudentDAO)context.getBean("studentJDBCTemplate");
		System.out.println("------Records Creation------");
		template.create("Red",  11, 99, 2010);
		template.create("Green", 2, 87, 2011);
		template.create("Blue", 15, 82, 2012);
		
		System.out.println("------Listing Multiple Records------");
		List<StudentMark> students = template.listStudents();
		
		for(StudentMark record: students){
			System.out.println(record);
		}
	}
}
