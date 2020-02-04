package com.tutorial.beanAnnotations;

import javax.annotation.*;

import org.springframework.beans.factory.annotation.*;

public class OuterClass {
	@Autowired //@Autowired(required=false) 
	@Qualifier("innerClass") //forces inner to be injected (needed when multiple types)
	private InnerClass inner;
	
	private String message;
	
	//@Required
	@Resource(name="message")
	public void setMessage(String message){
		this.message = message;
	}
	
	public String getMessage(){
		System.out.println("Outer Message: " + message);
		return message;
	}
	
	public InnerClass getInner(){
		System.out.println("Inner Message: "+ inner.getMessage());
		return inner;
	}
	
	//Alternate to init-method="init" 
	@PostConstruct
    public void init(){
       System.out.println("Outer Bean is going through init.");
    }
	
    //Alternate to destory-method="destroy"
    @PreDestroy
    public void destroy(){
       System.out.println("Outer Bean will destroy now.");
    }
}
