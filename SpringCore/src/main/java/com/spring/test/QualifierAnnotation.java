package com.spring.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.spring.beans.Table;

public class QualifierAnnotation {

	public static void main(String[] args) {
		
		
		ApplicationContext applicationContext = new FileSystemXmlApplicationContext
				("src/main/java/com/spring/cfgs/qualifier_annotation.xml");
		
		String[] allBeanNames = applicationContext.getBeanDefinitionNames();
        for(String beanName : allBeanNames) {
            System.out.println(beanName);
        }

        Table table =applicationContext.getBean("table", Table.class);
        
        System.out.println(table.toString());
	}

}
/*@Primary is an effective way to use autowiring by type with several instances when one primary candidate 
 * can be determined.
 * When more control over the selection process is required, Spring�s @Qualifier annotation can be used.
 * You can associate qualifier values with specific arguments, narrowing the set of type matches 
 * so that a specific bean is chosen for each argument*/