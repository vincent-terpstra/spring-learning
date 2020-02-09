package com.tutorial.beanLog;

public class Message {
	private String message1, message2, message3;
	
	//Getter & Setter for message 1
	public void setMessage1(String message1){
		this.message1 = message1;
	}
	
	public String getMessage1(){
		System.out.println(message1);
		return message1;
	}
}
