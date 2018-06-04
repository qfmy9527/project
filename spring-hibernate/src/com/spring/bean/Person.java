package com.spring.bean;



public class Person {
	private String name;
	private int age;
	private String name1;
	
	public String getName1() {
		return name1;
	}
	public void setName1(String name1) {
		this.name1 = name1;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String info() {
		return "my name is " +name +age;
		
	}
	
	
	
	
	
}
