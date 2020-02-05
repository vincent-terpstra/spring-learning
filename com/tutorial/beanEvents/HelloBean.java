package com.tutorial.beanEvents;

public class HelloBean {
	private String message;
	
	public void setMessage(String message){
		this.message = message;
	}
	
	public String getMessage(){
		System.out.println(message);
		return message;
	}

}
