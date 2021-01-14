package com.spring.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.spring.beans.HpLaptop;
import com.spring.cfgs.ImportConfig;
import com.spring.interfaces.Laptop;

public class ImportConfiguration {

	public static void main(String[] args) {
	
		ApplicationContext context = new AnnotationConfigApplicationContext(ImportConfig.class);
	
		Laptop laptop=	context.getBean(HpLaptop.class);
		laptop.info();
	}

}
