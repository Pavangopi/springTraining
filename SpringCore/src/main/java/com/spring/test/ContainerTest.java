package com.spring.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;

import com.spring.core.Student;

public class ContainerTest {
public static void main(String[] args) {
	
	System.out.println("-------------Using BeanFactory with ClassPathResource------------------------- ");
	Resource res=new ClassPathResource("com/spring/cfg/applicationContext.xml");
	BeanFactory factory1=new XmlBeanFactory(res);
	Student student1 = factory1.getBean("studentbean", Student.class);
	student1.displayInfo();
	
	
	System.out.println("-------------Using ApplicationContext with ClassPathXmlApplicationContext------------------------- ");
	ApplicationContext context = new ClassPathXmlApplicationContext("com/spring/cfg/applicationContext.xml");
	Student student2=(Student)context.getBean("studentbean");
	student2.displayInfo();
	
	System.out.println("-------------Using XmlBeanFactory with FileSystemResource------------------------- ");
	FileSystemResource res3 = new FileSystemResource("src/main/java/com/spring/cfg/applicationContext.xml");
	BeanFactory factory3 = new XmlBeanFactory(res3);
	Student student3 = factory3.getBean("studentbean", Student.class);
	student3.displayInfo();
	
	System.out.println("-------------Using ApplicationContext with FileSystemXmlApplicationContext------------------------- ");
	ApplicationContext ctx  =  new FileSystemXmlApplicationContext("src/main/java/com/spring/cfg/applicationContext.xml");
	Student student = ctx.getBean("studentbean", Student.class);
	student.displayInfo();
	
}
}
