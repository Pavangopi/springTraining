package com.spring.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.spring.beans.Dell;
import com.spring.beans.HpLaptop;
import com.spring.interfaces.Laptop;

public class Annotation_Application_Context {

	public static void main(String[] args) {
		
		ApplicationContext context = new FileSystemXmlApplicationContext
				("src/main/java/com/spring/cfgs/annotationApplicationContext.xml");

		Laptop hplaptop= context.getBean("hpLaptop", HpLaptop.class);
		hplaptop.info();

		Laptop dellLaptop =context.getBean("dell", Dell.class);
		dellLaptop.info();
	
	}
}
/*Note::
 * Annotation injection is performed before XML injection, thus the latter
 * configuration will override the former for properties wired through both
 * approaches.
 */