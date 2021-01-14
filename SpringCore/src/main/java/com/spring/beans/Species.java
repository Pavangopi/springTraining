package com.spring.beans;

import org.springframework.beans.factory.annotation.Autowired;

public class Species {
	
	public Species(Owner owner) {
		super();
		this.owner = owner;
	}

	@Autowired
	Owner owner;

	public Owner getOwner() {
		return owner;
	}

	public void setOwner(Owner owner) {
		this.owner = owner;
	}

	@Override
	public String toString() {
		return "Species [owner=" + owner.getName() + "]";
	}

}
