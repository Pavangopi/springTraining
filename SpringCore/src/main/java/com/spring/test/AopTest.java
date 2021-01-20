package com.spring.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.aop.Operation;

public class AopTest {

	 public static void main(String[] args){  
	        ApplicationContext context = new ClassPathXmlApplicationContext("com/spring/cfgs/aop_context.xml");  
	        Operation e = (Operation) context.getBean("opBean");  
	        System.out.println("calling method1...");  
	        e.method1();  
	        System.out.println("calling method2...");  
	        e.method2();  
	        System.out.println("calling method3...");  
	        e.method3();  
	    }  

}
