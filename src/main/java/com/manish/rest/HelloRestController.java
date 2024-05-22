package com.manish.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.manish.service.HelloService;

@RestController
public class HelloRestController {

	@Autowired
	private HelloService service;
	
	@GetMapping("/hello/{name}")
	public String getHelloMsg(@PathVariable String name) {
		String helloMessage = service.createHelloMessage(name);
		    return helloMessage;
	}
}
