package com.spring.beans;

import org.springframework.beans.factory.annotation.Autowired;

import com.spring.interfaces.Car;

public class CarOwner {
	
	String name;
	
	@Autowired
	Car car;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Car getCar() {
		return car;
	}

	public void setCar(Car car) {
		this.car = car;
	}

}
