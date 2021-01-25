package com.spring.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.spring.beans.Bike;

public class Inject_Annotation {

	public static void main(String[] args) {
		
		ApplicationContext applicationContext = new FileSystemXmlApplicationContext
				("src/main/java/com/spring/cfgs/inject_annotation.xml");
		
		String[] allBeanNames = applicationContext.getBeanDefinitionNames();
        for(String beanName : allBeanNames) {
            System.out.println(beanName);
        }
        
       Bike bike = 	applicationContext.getBean("bike", Bike.class);
       
       System.out.println(bike.toString());

	}

}
