package com.tutorial.beanTransaction;

public class StudentMark {
	private Integer age;
	private String name;
	
	private Integer  id, mark, year;
	
	public void setAge(Integer age){
		this.age = age;
	}
	
	public Integer getAge(){
		return age;
	}
	
	public void setName(String name){
		this.name = name;
	}
	
	public String getName(){
		return name;
	}
	
	public void setId(Integer id){
		this.id = id;
	}
	
	public Integer getId(){
		return id;
	}
	
	public void setMark(Integer mark){
		this.mark = mark;
	}
	
	public Integer getMark(){
		return mark;
	}
	
	public void setYear(Integer year){
		this.year = year;
	}
	
	public Integer getYear(){
		return year;
	}
	

	@Override
	public String toString(){
		return "ID: " + id + "Name: " + name + " Age: " + age + " Mark: " + mark + "Year:" + year;
	}
}
