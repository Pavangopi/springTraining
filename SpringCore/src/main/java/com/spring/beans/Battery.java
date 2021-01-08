package com.spring.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Battery {
	
	private int id;
	private String name;

	public int getId() {
		return id;
	}
	@Value("789")
	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}
	@Value("acerBattery")
	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Battery [id=" + id + ", name=" + name + "]";
	}
	

}
