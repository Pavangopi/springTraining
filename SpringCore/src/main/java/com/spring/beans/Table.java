package com.spring.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Table {

	@Autowired(required = false)
	@Qualifier("chair1")
	//If we comment @Qualifier annotation still it will not give any error because it internally using Autowiring
	//by name. So as per name concept it will give nilkamal as result because of property name chair if
	// it is chair1 it will give pepper fry as result.
	Chair chair;

	public Chair getChair() {
		return chair;
	}

	public void setChair(Chair chair) {
		this.chair = chair;
	}

	@Override
	public String toString() {
		return "Table [chair=" + chair + "]";
	}
	
}
//Upon setting the attribute required = false while peforming injection if the chair1 bean is not available 
// in IoC Container then BeanNotFoundException will not be thrown.