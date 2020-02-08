package com.tutorial.beanAspectJ;

import org.aspectj.lang.annotation.*;

@Aspect
public class Logging {
	
	@Pointcut("execution(* com.tutorial.beanAspectJ.InnerClass.*(..))")
	private void everyMethod(){}

	@Before("everyMethod()")
	public void beforeAdvice(){
		System.out.println("Executing before Advice");
	}
	
	@After("everyMethod()")
	public void afterAdvice(){
		System.out.println("Executing after Advice");
	}
	
	@AfterReturning(pointcut="everyMethod()", returning = "retVal")
	public void afterReturningAdvice(Object retVal){
		System.out.println("Returning: " + retVal);
	}
	
	@AfterThrowing(pointcut="everyMethod()", throwing="ex")
	public void AfterThrowingAdvice(IllegalArgumentException ex){
		System.out.println("Disaster adverted: " + ex.getClass());
	}
	/**
	@Around("everyMethod()")
	public void aroundAdvice(){
		
	}
	/**/
}
