package com.springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.service.HelloServiceClient;

@RestController
public class ConsumerController {
	
	@Autowired
	HelloServiceClient helloServiceClient;
	
	@GetMapping("/hello")
	public String hello(String name) {
		return "hello 1 " + name;
	}

	@GetMapping("/hello1")
	public String hello1(@RequestParam String name) {
		return "hello 1 " + name;
	}

	@GetMapping("/hello2")
	public String hello2(@RequestHeader String name, @RequestHeader int age) {
		return "hello 1 " + name + "  age:" + age;
	}
	
	@GetMapping(value = "/testPg")
	public String testPg() {
		return helloServiceClient.testPg();
	}
}
