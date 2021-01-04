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
		


	}
}
