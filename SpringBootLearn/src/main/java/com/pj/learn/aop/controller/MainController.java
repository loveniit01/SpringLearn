package com.pj.learn.aop.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.pj.learn.aop.service.ServiceClass;

@RestController
public class MainController {
	
	@GetMapping("/")
	public ResponseEntity<?> getRequest(@RequestParam String city, @RequestParam String name)
	{
		
		String respose = class1.execute(city, name);
		
		return ResponseEntity.status(HttpStatus.OK).body(respose);
	}
	
	@Autowired
	ServiceClass class1;

}
