package com.spring.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

@Component
@Aspect
@EnableAspectJAutoProxy
public class Helper {

	/*
	 * If we comment line @Component then aop features will not work the reason is AOP always looks for 
	 * beans available in ApplicationContext.So @Component annotation is required to use AOP
	 */ 
	
	@Before(value = "execution(public void showBalance(*))")
	public void log(JoinPoint joinPoint) {
		System.out.println("Bank bakance method is invoked ...");
		System.out.println(joinPoint.toString());
	}
	
	@Before(value = "execution(public void showBalance(*))")
	public void enableSecurityCheck() {
		System.out.println("User is authorized user...");
	}
	//Defaults to final advice even though exception occurred in JoinPoint method advice method will get executed.
	@After(value = "execution(public void showBalance(*))")
	public void closeTransaction(JoinPoint joinPoint) {
		System.out.println("closing the transaction with finally advice ");
		System.out.println(joinPoint.toLongString());
		System.out.println(joinPoint.getArgs());
	}
	//If Join Point method executes successfully then only Advice method will get executed.
	@AfterReturning(value = "execution(public void showBalance(*))")
	public void closeTransaction1(JoinPoint joinPoint) {
		System.out.println("closing the transaction when advice method executes successfully.");
		System.out.println(joinPoint.toLongString());
		System.out.println(joinPoint.getArgs());
	}
	//If Join Point Method throws any exception then only Advice Method will get executed.
	@AfterThrowing(value = "execution(public void showBalance(*))")
	public void closeTransaction2(JoinPoint joinPoint) {
		System.out.println("closing the transaction when Advice method throws an exception");
		System.out.println(joinPoint.toLongString());
		System.out.println(joinPoint.getArgs());
	}

	//Any advice method may declare as its first parameter, a parameter of type org.aspectj.lang.JoinPoint 
	//(please note that around advice is required to declare a first parameter of type ProceedingJoinPoint, 
	//which is a subclass of JoinPoint.
	@Around(value = "execution(public void showBalance(*))")
	public Object log(ProceedingJoinPoint joinPoint) throws Throwable {
		System.out.println("Logging the user action -------->Before Advice executed ");
		Object obj=joinPoint.proceed();
		System.out.println("Logging the user action --------->After Advice executed ");
		return obj;
	}
	
	@Pointcut("execution(public void showBalance(*))")
	private void anotherWayOfPointCut() {
		
	}
	
	@AfterReturning(value = "anotherWayOfPointCut()")
	public void closeTransaction3(JoinPoint joinPoint) {
		System.out.println("closing the transaction when advice method executes successfully using pointcut annotation.");
		System.out.println(joinPoint.toLongString());
		System.out.println(joinPoint.getArgs());
	}
}


//PointCut expression::execution(public void showBalance()
//log(),enableSecurityCheck(),closeTransaction() are cross cutting concerns of showBalance() method.
//And all cross cutting concerns are placed in a Aspect Class
//In order to enable aspect oriented annotations we need to add EnableAspectJAutoProxy 
//@Before is a advice to showBalnce which uses Point Cut Expression when to be executed.


/*
 * Aspect: a modularization of a concern that cuts across multiple classes.
 * Transaction management is a good example of a crosscutting concern in J2EE
 * applications. In Spring AOP, aspects are implemented using regular classes
 * (the schema-based approach) or regular classes annotated with the @Aspect
 * annotation (the @AspectJ style).
 * 
 * Join point: a point during the execution of a program, such as the execution
 * of a method or the handling of an exception. In Spring AOP, a join point
 * always represents a method execution.
 * 
 * Advice: action taken by an aspect at a particular join point. Different types
 * of advice include "around," "before" and "after" advice. (Advice types are
 * discussed below.) Many AOP frameworks, including Spring, model an advice as
 * an interceptor, maintaining a chain of interceptors around the join point.
 * 
 * Pointcut: a predicate that matches join points. Advice is associated with a
 * pointcut expression and runs at any join point matched by the pointcut (for
 * example, the execution of a method with a certain name). The concept of join
 * points as matched by pointcut expressions is central to AOP, and Spring uses
 * the AspectJ pointcut expression language by default.
 */