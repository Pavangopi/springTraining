package com.spring.cfgs;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import com.spring.beans.Battery;
import com.spring.beans.HpLaptop;
import com.spring.beans.I3Processor;
import com.spring.interfaces.Laptop;
import com.spring.interfaces.Processor;

/*This class is a replacement of applicationConetext.xml.If we want to xml files for beans initialization
 then we can use AppConfig like below for instantiating Beans
Spring @Configuration annotation is part of the spring core framework. 
Spring Configuration annotation indicates that the class has @Bean definition methods. 
So Spring container can process the class and generate Spring Beans to be used in the application.
*/
@Configuration
public class AppConfig {

	@Bean
	public Laptop hpLaptop() {
	
		return new HpLaptop();
	}
	@Bean
	public Battery battery() {
		return new Battery();
	}
	
	@Bean
	@Qualifier("i3Processor")
	public Processor processor() {
		return new I3Processor();
	}
}
