package com.spring.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.spring.beans.Employee;
import com.spring.beans.Species;
import com.spring.beans.Student;

public class Context_Annotation_Config {

	public static void main(String[] args) {
		
		ApplicationContext ctx  =  new FileSystemXmlApplicationContext
				("src/main/java/com/spring/cfgs/context-annotation.xml");

		String[] allBeanNames = ctx.getBeanDefinitionNames();
        for(String beanName : allBeanNames) {
            System.out.println(beanName);
        }
		
		Species student = ctx.getBean("species", Species.class);
		System.out.println(student.toString());

	}

}
/*
 * Species class is having a dependecy of Owner class in order to inject the dependency added
 * autowiring annotation on Species class Owner field but in order to wire the owner class
 * to Species class we need to intimate the Spring IoC Container i am using annotation based approach for injecting 
 * dependencies.If we remove the context-annotation-config declaration in xml this program will not get's executed.
 * 
 * For @Autowired annotation to work, we also need to enable annotation based configuration in 
 * spring bean configuration file. This can be done by context:annotation-config element or by defining 
 * a bean of type.
 */