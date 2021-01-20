package com.spring.beans;

import com.spring.interfaces.Car;

public class Kia implements Car{
	
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
