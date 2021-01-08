package com.spring.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.spring.interfaces.Processor;

@Component
public class I3Processor implements Processor{

	@Value("i3")
	String name;
	@Value("intel")
	String manufacturer;
	
	
	@Override
	public void info() {
			System.out.println(" My Processor is "+name+" manufactuerd by " +manufacturer);
	}


	@Override
	public String toString() {
		return "I3Processor [name=" + name + ", manufacturer=" + manufacturer + "]";
	}
}
