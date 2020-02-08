package com.tutorial.beanAspectJXML;

import org.aspectj.lang.annotation.*;

@Aspect
public class Logging {
	public void everyMethod(){}

	public void beforeAdvice(){
		System.out.println("Executing before Advice");
	}
	
	public void afterAdvice(){
		System.out.println("Executing after Advice");
	}
	
	public void afterReturningAdvice(Object retVal){
		System.out.println("Returning: " + retVal);
	}
	
	public void AfterThrowingAdvice(IllegalArgumentException ex){
		System.out.println("Disaster adverted: " + ex.getClass());
	}
	/**
	@Around("everyMethod()")
	public void aroundAdvice(){
		
	}
	/**/
}
