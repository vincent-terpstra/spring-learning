package com.tutorial.beanAutowiring;

public class OuterClass {
	private InnerClass inner;
	private String message;
	
	//Default Constructor
	public OuterClass(){}
	
	//Double argument Constructor
	public OuterClass(String message, InnerClass inner){
		this.message = message;
		this.inner = inner;
	}
	
	
	public void setMessage(String message){
		this.message = message;
	}
	
	public String getMessage(){
		System.out.println(message);
		return message;
	}
	
	public void setInner(InnerClass inner){
		this.inner = inner;
	}
	
	public InnerClass getInner(){
		System.out.println(inner.getMessage());
		return inner;
	}
}
