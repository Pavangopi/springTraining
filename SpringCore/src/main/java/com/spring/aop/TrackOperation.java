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

@Aspect
public class TrackOperation {

	//Pointcut expression
	//@Pointcut("execution(* Operation.*(..))")  
	@Pointcut("within(com.spring..*)")
    public void myPointCut(){}
      
    @Before("myPointCut()") 
    public void myBeforeAdvice(JoinPoint jp)
    {  
        System.out.println("additional concern for @Before");  
    }  
    
    @After("myPointCut()")
    public void myAfterAdvice(JoinPoint jp)  
    {  
        System.out.println("additional concern for @after");   
    }  
	
    @Around("myPointCut()")  
    public Object myAroundAdvice(ProceedingJoinPoint pjp) throws Throwable   
    {  
        System.out.println("Additional Concern for @Around Before  calling");  
        Object obj=pjp.proceed();  
        System.out.println("Additional Concern for @AroundAfter calling");  
        System.out.println("------------------------------------------");
        return obj;  
    }  
    
    @AfterReturning(  
            pointcut = "execution(* Operation.*(..))",  
            returning= "result")  
              
  public void myAfterReturningAdvice(JoinPoint jp,Object result)  
  {  
      System.out.println("additional concern for @AfterReturning");  
      //System.out.println("@AfterReturning for Method Signature: "  + jp.getSignature());  
      System.out.println(" @AfterReturning for Result in advice: "+result);  
      System.out.println("end of after returning advice...");  
  } 
    
    @AfterThrowing(  
            pointcut = "execution(* Operation.*(..))",  
            throwing= "error")  
              
  public void myAfterThrowingAdvice(JoinPoint jp,Throwable error)  
  {  
      System.out.println("additional concern for @AfterThrowing");  
     // System.out.println("@AfterThrowing forMethod Signature: "  + jp.getSignature());  
      System.out.println("@AfterThrowing for Exception is: "+error);  
      System.out.println("end of after throwing advice...");  
  }    
    
}
