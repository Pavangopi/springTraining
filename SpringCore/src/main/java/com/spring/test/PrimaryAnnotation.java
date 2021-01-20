package com.spring.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.spring.beans.CarOwner;

public class PrimaryAnnotation {

	public static void main(String[] args) {

		ApplicationContext applicationContext = new FileSystemXmlApplicationContext
				("src/main/java/com/spring/cfgs/primary_annotation.xml");
		
		String[] allBeanNames = applicationContext.getBeanDefinitionNames();
        for(String beanName : allBeanNames) {
            System.out.println(beanName);
        }
        
        CarOwner carOwner =	applicationContext.getBean("carOwner", CarOwner.class);
        
        carOwner.getCar().info();

	}

}
//In above example we are using xml based approach
//see AnnotationAppConfig.java program for @Primary annotation based
//approach which includes @Qualifier annotation also.

/*@Primary is an effective way to use autowiring by type with several instances when one primary candidate 
 * can be determined.
 * When more control over the selection process is required, Spring’s @Qualifier annotation can be used.
 * You can associate qualifier values with specific arguments, narrowing the set of type matches 
 * so that a specific bean is chosen for each argument*/