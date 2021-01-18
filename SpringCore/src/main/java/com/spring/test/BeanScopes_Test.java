package com.spring.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.spring.beans.Employee;
import com.spring.beans.Student;

public class BeanScopes_Test {
	public static void main(String[] args) {


		ApplicationContext ctx = new FileSystemXmlApplicationContext("src/main/java/com/spring/cfgs/ac_Scopes.xml");
		
		System.out.println("------Singleton Scope ------- ");
		Employee emp1 = ctx.getBean("empBean", Employee.class);
		emp1.setEmpName("SUNIL");
		System.out.println(emp1.toString());

		Employee emp2 = ctx.getBean("empBean", Employee.class);
		System.out.println(emp2.toString());
		System.out.println();
		System.out.println("emp1==emp2::::::"+(emp1==emp2));
	//------------------------------------------------------------------------------------------------	
		System.out.println("------Prototype Scope------- ");
		Student student1 = ctx.getBean("studentBean", Student.class);
		student1.setName("SSSS");
		System.out.println(student1.toString());
		System.out.println();
		
		Student student2 = ctx.getBean("studentBean", Student.class);
		System.out.println(student2.toString());
		System.out.println();
		System.out.println("student1==student2:::"+(student1==student2));
		
		/*Single Ton Bean
		 * when you define a bean definition and it is scoped as a singleton, the Spring
		 * IoC container creates exactly one instance of the object defined by that bean
		 * definition. This single instance is stored in a cache of such singleton
		 * beans, and all subsequent requests and references for that named bean return
		 * the cached object.
		 * 
		 * Singleton beans with prototype-bean dependencies:
		 * You cannot dependency-inject a prototype-scoped bean into your singleton bean, because that 
		 * injection occurs only once, when the Spring container is instantiating the singleton bean and resolving 
		 * and injecting its dependencies. 
		 */
	}
}
