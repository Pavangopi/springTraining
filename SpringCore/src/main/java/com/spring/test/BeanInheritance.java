package com.spring.test;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.spring.beans.ChildBean;
import com.spring.beans.ParentBean;

public class BeanInheritance {

	public static void main(String[] args) {
		
		ConfigurableApplicationContext ctx  =  new FileSystemXmlApplicationContext
				("src/main/java/com/spring/cfgs/bean_inheritance.xml");

		ChildBean childBean =  ctx.getBean("childBean", ChildBean.class);
		System.out.println(childBean.toString());
		//Here  for child xml we have not set the teacher property but still getting the output 
		//due to bean inheritance.
		
		//This will give error[Bean definition is abstract] due to class attribute not mentioned in
		//configuration xml
		//ParentBean parentBean =ctx.getBean("parentBean1", ParentBean.class);
		
		
		ChildBean childBean1 =  ctx.getBean("childBean1", ChildBean.class);
		System.out.println(childBean1.toString());
	}
}

/*
 * A child bean definition inherits scope, constructor argument values, property
 * values, and method overrides from the parent, with the option to add new
 * values.Any scope, initialization method, destroy method, and/or static
 * factory method settings that you specify will override the corresponding
 * parent settings.
 * 
 * The remaining settings are always taken from the child definition: depends
 * on, autowire mode, dependency check, singleton, lazy init.
 */