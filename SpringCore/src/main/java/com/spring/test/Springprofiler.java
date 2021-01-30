package com.spring.test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.spring.beans.DataSource;
import com.spring.cfgs.StandaloneDataSourceConfig;

public class Springprofiler {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
		ctx.getEnvironment().setActiveProfiles("prd");
		//ctx.getEnvironment().setActiveProfiles("dev");
		ctx.register(StandaloneDataSourceConfig.class);
		ctx.refresh();
		
		String[] allBeanNames = ctx.getBeanDefinitionNames();
        for(String beanName : allBeanNames) {
            
        	System.out.println(beanName);
        }
        
        DataSource d=	ctx.getBean("dataSourcePrd", DataSource.class);
        //DataSource d=	ctx.getBean("dataSourceDev", DataSource.class);
    	System.out.println(d.toString());
        
	}

}
/*Spring Profilers are mainly used to exclude a bean from adding to application context.
 *For ex u have a configuration class with dev datasource and PRD Datasource beans. 
 *Suppose rather than adding both beans to application context depending upon server i need 
 *to configure the datasource bean i.e if server is DEV then i need only Dev Datasouce bean to be added to
 *application context. This can be achieved by using Spring Profilers.
 *
 * Spring Profilers and Conditional annotation. It is often useful to
 * conditionally enable or disable a complete @Configuration class, or even
 * individual @Bean methods, based on some arbitrary system state. One common
 * example of this is to use the @Profile annotation to activate beans only when
 * a specific profile has been enabled in the Spring Environment.
 * 
 * The @Profile annotation is actually implemented using a much more flexible
 * annotation called @Conditional. The @Conditional annotation indicates
 * specific org.springframework.context.annotation.Condition implementations
 * that should be consulted before a @Bean is registered.
 */