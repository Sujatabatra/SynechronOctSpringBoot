package com.sujata.training;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.context.annotation.Configuration;

@Aspect
@Configuration
public class Audience {

	@Pointcut("execution(* com.sujata.training.Performer.perform(..)) ")
	public void performPointcut(){
		
	}
	
	@Before("performPointcut()")
	public void takeSeats(){
		System.out.println("Audience are taking their seats!!!");
	}
	
	@Before("performPointcut()")
	public void switchOffCellPhones(){
		System.out.println("Audeince are requested to switch off their cell phones");
	}
	
	@AfterReturning("performPointcut()")
	public void applaud(){
		System.out.println("CLAP CLAP CLAP!!!");
	}
	
	@AfterThrowing("performPointcut()")
	public void demandRefund(){
		System.out.println("BOOOO We need our money back.... :-( ");
	}
	
	@After("performPointcut()")
	public void leave(){
		System.out.println("Audience Leaving Auditorium and going home!!");
	}
	
//	@Around("performPointcut()")
//	public void watchPerformance(ProceedingJoinPoint joinpoint){
//		try{
//			//Before
//			takeSeats();
//			switchOffCellPhones();
//			
//			joinpoint.proceed();
//			
//			//After-returning
//			applaud();
//		}
//		catch (Throwable e) {
//			//After-throwing
//			demandRefund();
//		}
//		finally {
//			//After
//			leave();
//		}
//	}
}
