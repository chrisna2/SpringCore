package com.example.demo.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class EventAspect {
	
	//@Around("execution(* com.example.demo.service.EventService.*(..))")
	@Around("@annotation(com.example.demo.annotation.PerfLogging)")//패키지 경로 까지 같이  어노테이션을 추가 해야 됨(강의와 다름)
	//@Around("bean(EventService)")//빈은 그냥 안되는데?
	public Object checkTime(ProceedingJoinPoint joinpoint) throws Throwable {
		long begin = System.currentTimeMillis();
		Object rtnVal = joinpoint.proceed();
		System.out.println(System.currentTimeMillis() - begin);
		return rtnVal;
	}
	//근데 나는 포인트 컷이 더 좋은데?
	@Before("execution(* com.example.demo.service.EventService.*(..))")
	public void sayHello() {
		System.out.println("hello world");
	}
}
