package com.pj.learn.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

@Component
@Aspect
@EnableAspectJAutoProxy
public class HelperClass {

	@Before("execution(public void show())")
	public void logs()
	{
		System.out.println("printing logs......");
	}
}
