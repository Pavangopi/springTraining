package com.spring.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.spring.beans.HpLaptop;
import com.spring.cfgs.AppConfig;
import com.spring.interfaces.Laptop;

public class AnnotationAppConfig {

	public static void main(String[] args) {
		
		//Using @Configuration and @Bean annotation for adding beans into IoC Container
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		
		String[] allBeanNames = context.getBeanDefinitionNames();
        for(String beanName : allBeanNames) {
            System.out.println(beanName);
        }

		  Laptop laptop= context.getBean(HpLaptop.class);

		  laptop.info();
	}
}
