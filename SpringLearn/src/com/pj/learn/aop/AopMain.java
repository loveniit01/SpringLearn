package com.pj.learn.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AopMain {

	public static void main(String[] args) {

		ApplicationContext  ac =  new AnnotationConfigApplicationContext(AppConfig.class);
		Alien a1= ac.getBean(Alien.class);
		a1.show();
		
	}

}
