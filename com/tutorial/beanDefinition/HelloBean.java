package com.tutorial.beanDefinition;

public class HelloBean {
	private String message;
	
	public HelloBean(){}
	
	//Direct injection
	public HelloBean(String message){
		this.message = message;
	}
	
	public void setMessage(String message){
		this.message = message;
	}
	
	public String getMessage(){
		System.out.println(message);
		
		return message;
	}
	
	public void init(){
		System.out.println("Init for Hello Bean");
	}
	
	public void destroy(){
		System.out.println("Self Destructing");
	}

}
