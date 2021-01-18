package com.spring.beans;

public class Student {
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void displayInfo() {
		System.out.println("Hello: " + name);
	}

	public String toString() {
		return "Student [name=" + name + "]";
	}
	
	public void init() {
		System.out.println("Bean is going to be initialized in Student ");
	}
	
	public void dispose() {
		System.out.println("Spring IoC Container destroying the bean in Student..");
	}
}
