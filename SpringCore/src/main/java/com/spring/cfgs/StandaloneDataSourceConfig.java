package com.spring.cfgs;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.spring.beans.DataSource;

@Configuration
public class StandaloneDataSourceConfig {

	@Bean
	@Profile("dev")
	public DataSource dataSourceDev() {
		
		DataSource d = new DataSource();
		d.setDbname("devDb");
		
		return d;
	}
	
	@Bean
	@Profile("prd")
	public DataSource dataSourcePrd() {
		
		DataSource d = new DataSource();
		d.setDbname("PrdDb");
		
		return d;
	}
}
// In web application spring Profilers is implemented in a different way.Please see link available
// in notepad.