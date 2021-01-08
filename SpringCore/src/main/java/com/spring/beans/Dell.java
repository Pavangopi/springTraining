package com.spring.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.spring.interfaces.Laptop;
import com.spring.interfaces.Processor;

@Component
public class Dell implements Laptop {
	
	@Value("456")
	private int id;
	@Value("dellLappy")
	private String name;
	@Autowired
	private Battery battery;
	@Autowired
	@Qualifier("processorI5")
	Processor processor;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "Dell [id=" + id + ", name=" + name + ", battery=" + battery + "]";
	}

	public void info() {
		System.out.println("Hey I am "+name +" with Battery "+battery + " having "+processor.toString());
		
	}

}
