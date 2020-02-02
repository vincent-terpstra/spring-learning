package com.tutorial;

public class ConstructorDI {
	private InjectClass inject;
	
	public ConstructorDI(InjectClass inject){
		System.out.println("Creating Constructor Dependency Injector");
		this.inject = inject;
	}
	
	public void message(){
		inject.message();
	}
	
}
