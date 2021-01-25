package com.spring.beans;

import javax.inject.Inject;
import javax.inject.Named;

@Named
public class Bike {
	
	String bikeName;
	
	@Inject
	@Named("key12")
	Key key;

	public String getBikeName() {
		return bikeName;
	}
	
	public void setBikeName(String bikeName) {
		this.bikeName = bikeName;
	}

	@Override
	public String toString() {
		return "Bike [bikeName=" + bikeName + ", key=" + key.getKeyId() + "]";
	}
	
	

}
