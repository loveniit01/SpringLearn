package com.pj.learn.aop.service;

import org.springframework.stereotype.Service;

@Service
public class ServiceClass {

	public String execute(String address, String name)
	{
		System.out.println("service class execute method invode.....");
		return "Service class return "+name;
	}
}
