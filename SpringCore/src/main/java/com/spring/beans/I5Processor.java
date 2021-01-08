package com.spring.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.spring.interfaces.Processor;

@Component("processorI5")
public class I5Processor implements Processor{

	String name;
	String manufacturer;
	
	public String getName() {
		return name;
	}

	@Value("I5")
	public void setName(String name) {
		this.name = name;
	}

	public String getManufacturer() {
		return manufacturer;
	}

	@Value("Microsoft")
	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}

	@Override
	public void info() {
		
	}

	@Override
	public String toString() {
		return "I5Processor [name=" + name + ", manufacturer=" + manufacturer + "]";
	}

}
