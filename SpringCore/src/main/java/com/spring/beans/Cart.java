package com.spring.beans;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;

public class Cart {
	
	int id;
	@Autowired
	Set<Items> items;

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Set<Items> getItems() {
		return items;
	}
	public void setItems(Set<Items> items) {
		this.items = items;
	}
	@Override
	public String toString() {
		return "Cart [id=" + id + ", items=" + items + "]";
	}

	
}
