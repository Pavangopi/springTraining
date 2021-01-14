package com.spring.beans;

import org.springframework.beans.factory.annotation.Autowired;

public class Tv {

	String brand;
	
	//Autowired annotation on variable/setters is equivalent to autowire="byType"
	//https://mkyong.com/spring/spring-autowiring-by-name/ 
	//Autowiring by Type (Type internally uses by Name see above links and for ex see QualifierAnnotation program xml
	//@Autowired
	Remote remote1;
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public Remote getRemote1() {
		return remote1;
	}
	//@Autowired
	public void setRemote1(Remote remote1) {
		this.remote1 = remote1;
	}
	@Override
	public String toString() {
		return "Tv [brand=" + brand + ", remote=" + remote1.getChannelno() + "]";
	}
	//Autowired annotation on Constructor is equivalent to autowire="constructor"
	@Autowired
	public Tv(Remote remote1) {
		super();
		this.remote1 = remote1;
	}
}
/*
 * You can use @Resource annotation on fields or setter methods and it works the
 * same as in Java EE 5. The @Resource annotation takes a 'name' attribute which
 * will be interpreted as the bean name to be injected. You can say, it follows
 *  autowiring by-name.
 */