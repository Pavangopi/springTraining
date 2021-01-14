package com.spring.cfgs;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import(AppConfig.class)
public class ImportConfig {

	//In Import annotation we can pass multiple AppConfig.class files. This can be used when we split 
	// beans of service layer or DAO layer. i.e All service layer related beans in one AppConfig file
	// and all DAO layer beans in another AppConfig file and if we want to import service and Dao layer beans
	// we can use Import annotation.It is similar to component scan.
}
