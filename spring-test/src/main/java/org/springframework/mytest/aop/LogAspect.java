package org.springframework.mytest.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import java.util.Arrays;

/**
 * @author TheNai
 * @date 2023-04-07
 * 正常顺序 ： 前置通知 -> 目标方法 -> 返回通知 -> 后置通知
 * 异常顺序 ： 前置通知 -> 目标方法 -> 异常通知 -> 后置通知
 * try{
 *     前置通知
 *     目标方法
 *     返回通知
 * }catch(){
 *     异常通知
 * }finally{
 *     后置通知
 * }
 */
@Component
@Aspect
public class LogAspect {

	public LogAspect() {
		System.out.println("LogAspect...");
	}

	//前置通知  增强方法/增强器
	@Before("execution(* org.springframework.mytest.aop.HelloService.sayHello(..))")
	public void logStart(JoinPoint joinPoint){
		String name = joinPoint.getSignature().getName();
		System.out.println("logStart()==>"+name+"....【args: "+ Arrays.asList(joinPoint.getArgs()) +"】");
	}

	//返回通知
	@AfterReturning(value = "execution(* org.springframework.mytest.aop.HelloService.sayHello(..))",returning = "result")
	public void logReturn(JoinPoint joinPoint,Object result){
		String name = joinPoint.getSignature().getName();
		System.out.println("logReturn()==>"+name+"....【args: "+ Arrays.asList(joinPoint.getArgs()) +"】【result: "+result+"】");
	}


	//后置通知
	@After("execution(* org.springframework.mytest.aop.HelloService.sayHello(..))")
	public void logEnd(JoinPoint joinPoint){
		String name = joinPoint.getSignature().getName();
		System.out.println("logEnd()==>"+name+"....【args: "+ Arrays.asList(joinPoint.getArgs()) +"】");
	}


	//异常
	@AfterThrowing(value = "execution(* org.springframework.mytest.aop.HelloService.sayHello(..))",throwing = "e")
	public void logError(JoinPoint joinPoint,Exception e){
		String name = joinPoint.getSignature().getName();
		System.out.println("logError()==>"+name+"....【args: "+ Arrays.asList(joinPoint.getArgs()) +"】【exception: "+e+"】");
	}
}
