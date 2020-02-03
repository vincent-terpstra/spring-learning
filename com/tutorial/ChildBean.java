package com.tutorial;

public class ChildBean {
	private String message1;
	private String message2;
	
	public void setMessage2(String message2){
		this.message2 = message2;
	}
	
	public void setMessage(String message){
		this.message1 = message;
	}
	
	public void getMessage2(){
		System.out.println(message2);
	}
	
	public void getMessage(){
		System.out.println(message1);
	}
}
