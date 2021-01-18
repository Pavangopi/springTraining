package com.spring.test;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.spring.beans.Director;
import com.spring.beans.Student;

public class BeanLifeCycle {

	public static void main(String[] args) {
		
		ConfigurableApplicationContext ctx  =  new FileSystemXmlApplicationContext
				("src/main/java/com/spring/cfgs/beanLifeCycleMethods.xml");
		
		//bean Implementing InitializingBean,DisposableBean interfaces
		//Drawback is couples the code with interfaces
		Director director=ctx.getBean("dir", Director.class);
		System.out.println(director.toString());

		//Xml based init and destroy methods
		//Drawback is achieved by xml based attributes
		Student s=	ctx.getBean("student", Student.class);
		
		//default-init-method,default-destroy-method on beans tag in xml then no need to add init and
		//destroy method declarations to each and every bean.
		
		ctx.registerShutdownHook();
	}

}
/*
 * BeanPostProcessor interface defines callback methods that you can implement
 * to provide your own instantiation logic, dependency-resolution logic, etc.
 * You can also implement some custom logic after the Spring container finishes
 * instantiating, configuring, and initializing a bean by plugging in one or
 * more BeanPostProcessor implementations.
 * 
 * If Multiple lifecycle mechanisms configured for the same bean, with different initialization methods, 
 * then order of execution is as follows:
• 1)Methods annotated with @PostConstruct
• 2)afterPropertiesSet() as defined by the InitializingBean callback interface
• 3)A custom configured init() method
 Destroy methods are called in the same order:
• 1)Methods annotated with @PreDestroy
• 2)destroy() as defined by the DisposableBean callback interface
• 3)A custom configured destroy() method
 */
