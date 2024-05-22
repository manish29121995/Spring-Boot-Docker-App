package com.manish.service;

import org.springframework.stereotype.Service;

@Service
public class HelloService {

	public String createHelloMessage(String name) {
		
		String msg = "Hello, " + name + " Welcome To Hyderabad...";
		return msg;
	}
}
