package com.spring.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.spring.interfaces.Laptop;
import com.spring.interfaces.Processor;

@Component
public class HpLaptop implements Laptop{

	@Value("123")
	int id;
	@Value("hpLappy")
	String name;

	@Autowired
	Battery battery;

	
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

	public Battery getBattery() {
		return battery;
	}

	public void setBattery(Battery battery) {
		this.battery = battery;
	}

	public Processor getProcessor() {
		return processor;
	}

	@Autowired
	@Qualifier("i3Processor")
	public void setProcessor(Processor processor) {
		this.processor = processor;
	}
	public void info() {
		System.out.println("I am "+name + " with holding "+battery.toString()+" having "+processor.toString());
	}
	public void init() {
		System.out.println("Bean created for HpLaptop class ");
	}
}
