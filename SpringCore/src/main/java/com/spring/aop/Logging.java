package com.spring.aop;

import org.aspectj.lang.ProceedingJoinPoint;

public class Logging {

	public void beforeAdvice() {
		System.out.println("Advice executed before as a part of service layer logs..");
	}
	
	
	public void afterAdvice() {
		System.out.println("Advice executed after  service layer method execution for printing logs..");
	}
	
	public void afterThrowing() {
		System.out.println("Service layer got a problem...");
	}
	
	public void afterReturning() {
		System.out.println("Advice executed after  successful execution of service layer method..");
	}
	
	public Object doAround(ProceedingJoinPoint joinPoint) throws Throwable {
		System.out.println("Around advice is executing before..");
		Object o=	joinPoint.proceed();
		System.out.println("Around advice is executing after..");
		return o;
	}
	
	public void afterAdviceParameters(String acc1,String acc2) {
		System.out.println("Advice with parameters is executing.."+acc1+"...."+acc2);
	}
}
