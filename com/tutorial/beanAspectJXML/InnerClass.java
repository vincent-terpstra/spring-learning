package com.tutorial.beanAspectJXML;

public class InnerClass {
	String message;
	
	public void setMessage(String message){
		this.message = message;
	}
	
	public String getMessage(){
		System.out.println(message);
		return message;
	}
	
	public void throwException(){
		System.out.println("Exception thrown");
		throw new IllegalArgumentException();
	}
	
	public String toString(){
		return "InnerClass: " + message;
	}
}
