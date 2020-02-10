package com.tutorial.beanSQL;

import java.util.List;

import org.apache.commons.logging.*;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
	static Log log = LogFactory.getLog(MainApp.class.getName());
	
	public static void main(String[] args) {
		AbstractApplicationContext context = 
		new ClassPathXmlApplicationContext("com/tutorial/beanSQL/Beans.xml");
		
		StudentDAO template = (StudentDAO)context.getBean("studentJDBCTemplate");
		System.out.println("------Records Creation------");
		template.create("Red",  11);
		template.create("Green", 2);
		template.create("Blue", 15);
		
		System.out.println("------Listing Multiple Records------");
		List<Student> students = template.listStudents();
		
		for(Student record: students){
			System.out.println(record);
		}
		
		System.out.println("----Updating Record with ID = 2 ----");
		template.update(2,  20);
		
		Student student = template.getStudent(2);
		
		System.out.print(student);
		
		
	}
}
