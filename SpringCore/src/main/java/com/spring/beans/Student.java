package com.spring.beans;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

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
	//@PostConstruct
	public void init() {
		System.out.println("Bean is going to be initialized in Student ");
	}
	//@PreDestroy
	public void dispose() {
		System.out.println("Spring IoC Container destroying the bean in Student..");
	}
}
