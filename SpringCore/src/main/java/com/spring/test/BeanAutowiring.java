package com.spring.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.spring.beans.Tv;

public class BeanAutowiring {

	public static void main(String[] args) {
	
		ApplicationContext applicationContext = new FileSystemXmlApplicationContext
				("src/main/java/com/spring/cfgs/bean_auto_wiring.xml");
		
		String[] allBeanNames = applicationContext.getBeanDefinitionNames();
        for(String beanName : allBeanNames) {
            System.out.println(beanName);
        }
	
		Tv tv=applicationContext.getBean("tv", Tv.class);
	
		System.out.println(tv.toString());

	}
}
