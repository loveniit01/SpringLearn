package com.pj.learn.aop.helper;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

@Component
@Aspect
@EnableAspectJAutoProxy
public class HelperClass {

	@Before("execution(public String execute(String, String))&&  args(city,   name)")
	public void log(String city, String name)
	{
		System.out.println("printing from healper class..... city: "+city+" , name : "+name);
	}
}
