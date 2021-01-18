package com.spring.beans;

public class ChildBean {

	String name;
	String designation;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	@Override
	public String toString() {
		return "ChildBean [name=" + name + ", age=" + designation + "]";
	}
	
}
