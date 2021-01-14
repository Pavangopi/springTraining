package com.spring.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;

public class Owner {

	@Value("123")
	int id;
	
	@Value("sree")
	String name;
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

}
