package com.spring.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.spring.beans.Director;

public class BeanLifeCycle {

	public static void main(String[] args) {
		
		ApplicationContext ctx  =  new FileSystemXmlApplicationContext
				("src/main/java/com/spring/cfgs/beanLifeCycleMethods.xml");
		
		Director director=ctx.getBean("dir", Director.class);
		System.out.println(director.toString());


	}

}
/*
 * BeanPostProcessor interface defines callback methods that you can implement
 * to provide your own instantiation logic, dependency-resolution logic, etc.
 * You can also implement some custom logic after the Spring container finishes
 * instantiating, configuring, and initializing a bean by plugging in one or
 * more BeanPostProcessor implementations.
 */