package com.spring.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.spring.beans.Employee;

public class Injections_Test {
	public static void main(String[] args) {

		System.out.println("------Using Constructor Injection------- ");
		ApplicationContext ctx = new FileSystemXmlApplicationContext("src/main/java/com/spring/cfgs/ac_Injections.xml");
		
		System.out.println("------Constructor Injection with sequence/order------- ");
	//	Employee emp1 = ctx.getBean("empBean1", Employee.class);
		Employee emp1 = (Employee) ctx.getBean("empBean1");
		System.out.println(emp1.toString());
		
		System.out.println("------Constructor Injection with type------- ");
		Employee emp2 = ctx.getBean("empBean2", Employee.class);
		System.out.println(emp2.toString());
		System.out.println();
		
		System.out.println("------Constructor Injection with index------- ");
		Employee emp3 = ctx.getBean("empBean3", Employee.class);
		System.out.println(emp3.toString());
		System.out.println("------ Constructor Injection End------- ");
		System.out.println();
		
		System.out.println("------Using Setter Injection------- ");
		Employee emp4 = ctx.getBean("empBean4", Employee.class);
		System.out.println(emp4.toString());
		System.out.println();
		System.out.println("------Using Setter Injection End------- ");
		
		System.out.println("------Using Constructor and Setter Injection------- ");
		Employee emp5 = ctx.getBean("empBean5", Employee.class);
		System.out.println(emp5.toString());
		System.out.println();
		System.out.println("------Using Constructor and Setter Injection End------- ");
		
		System.out.println("------Using Mixed Injection------- ");
		Employee emp6 = ctx.getBean("empBean6", Employee.class);
		System.out.println(emp6.toString());
		System.out.println();
		System.out.println("------Using Mixed Constructor Injection End------- ");

	}
}
