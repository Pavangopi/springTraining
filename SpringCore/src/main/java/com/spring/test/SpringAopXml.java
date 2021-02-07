package com.spring.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.spring.aop.BankBalance;

public class SpringAopXml {

	public static void main(String[] args) {
		
		ApplicationContext context = new 
				FileSystemXmlApplicationContext("/src/main/java/com/spring/cfgs/springAop_xmlBased.xml");
		
		BankBalance bankBalance =context.getBean("bankBalance", BankBalance.class);
		
		bankBalance.showBalance(10);
		
		//Advice method with parameters example is not working...
		//bankBalance.transferBalance("100106", "246874");

	}

}
