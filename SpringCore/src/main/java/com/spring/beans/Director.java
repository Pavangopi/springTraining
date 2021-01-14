package com.spring.beans;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Director implements InitializingBean,DisposableBean {

	String dirName;
	String workingOn;
	@Override
	public String toString() {
		return "Director [name=" + dirName + ", workingOn=" + workingOn + "]";
	}
	public String getDirName() {
		return dirName;
	}
	public void setDirName(String dirName) {
		this.dirName = dirName;
	}
	public String getWorkingOn() {
		return workingOn;
	}
	public void setWorkingOn(String workingOn) {
		this.workingOn = workingOn;
	}
	
	@Override
	public void afterPropertiesSet() throws Exception {
		 System.out.println("i am in init");
		
	}
	@Override
	public void destroy() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("going to destroy");
	}
	//PostConstruct and PreDestroy annotations are similar to bean init and bean destroy methods
	
}
