package com.spring.test;

import java.util.Iterator;
import java.util.Set;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.spring.beans.Cart;
import com.spring.beans.Items;
import com.spring.beans.Tv;

public class BeanAutowiring {

	public static void main(String[] args) {
	
		ApplicationContext applicationContext = new FileSystemXmlApplicationContext
				("src/main/java/com/spring/cfgs/bean_auto_wiring.xml");
		
		String[] allBeanNames = applicationContext.getBeanDefinitionNames();
        for(String beanName : allBeanNames) {
            System.out.println(beanName);
        }
	
		Tv tv=applicationContext.getBean("tv", Tv.class);
	
		System.out.println(tv.toString());
		
		Cart cart =	applicationContext.getBean("cart", Cart.class);
		
		Set<Items> is =cart.getItems();
		
		Iterator<Items> it = is.iterator();
	     while(it.hasNext()){
	        System.out.println(it.next().getName());
	     }

	}
}
