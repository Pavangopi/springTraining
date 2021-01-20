package com.spring.beans;

import org.springframework.context.annotation.Primary;

import com.spring.interfaces.Car;

@Primary
public class Tesla implements Car{

	String name;
	int price;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public void info() {
		
		System.out.println(" "+name + " Car with " +price +"$");
	}

}
