package com.spring.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.spring.aop.BankBalance;
import com.spring.cfgs.SpringAopCfg;

public class SpringAop {

	public static void main(String[] args) {
		
		ApplicationContext context = new AnnotationConfigApplicationContext(SpringAopCfg.class);
		
		BankBalance bankBalance =context.getBean("bankBalance", BankBalance.class);
		
		bankBalance.showBalance(10);

	}
}
