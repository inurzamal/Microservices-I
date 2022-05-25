package com.nur.rest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetRestController {
	
	private Logger logger = LoggerFactory.getLogger(GreetRestController.class);
	
	@GetMapping("/greet/{name}")
	public String greetMsg(@PathVariable String name) {		
		logger.info("greetMsg() execution - start");
		String msg =name+", Good Morning..";
		logger.info("greetMsg() execution - end");
		return msg;
	}
	
	@GetMapping("/greetNew")
	public String greetMsgNew() {
		return "Good Afternoon..";	
	}
	
	@GetMapping("/greet")
	public String greetTest() {
		return "Test Greet";
	}
}
