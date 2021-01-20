package com.spring.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.spring.beans.HpLaptop;
import com.spring.cfgs.AppConfig;
import com.spring.interfaces.Laptop;

public class AnnotationAppConfig {

	public static void main(String[] args) {
		
		//Using @Configuration and @Bean annotation for adding beans into IoC Container
		//Using @Primary and @Qualifier annotations for injecting the dependencies
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		
		String[] allBeanNames = context.getBeanDefinitionNames();
        for(String beanName : allBeanNames) {
            System.out.println(beanName);
        }

		  Laptop laptop= context.getBean(Laptop.class);

		  laptop.info();
	}
}
/*@Primary is an effective way to use autowiring by type with several instances when one primary candidate 
 * can be determined.
 * When more control over the selection process is required, Spring’s @Qualifier annotation can be used.
 * You can associate qualifier values with specific arguments, narrowing the set of type matches 
 * so that a specific bean is chosen for each argument*/