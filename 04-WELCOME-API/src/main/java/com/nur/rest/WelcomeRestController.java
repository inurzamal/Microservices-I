package com.nur.rest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.nur.client.GreetApiClient;

@RestController
public class WelcomeRestController {
	
	private Logger logger = LoggerFactory.getLogger(WelcomeRestController.class);
	
	@Autowired
	private GreetApiClient greetClient;
	
	@GetMapping("/welcome/{name}")
	public String welcomeMsg(@PathVariable String name) {
		
		logger.info("welcomeMsg() execution - start");
		
		String welcomeMsg = "Welcome to NIELIT Guwahati";
		
//		RestTemplate rt = new RestTemplate();
//		rt.getForEntity("http://localhost:9090/greet", String.class);
		
		String greetMsg = greetClient.invokeGreetApi(name);
		
		logger.info("welcomeMsg() execution - end ");
				
		return greetMsg + " " + welcomeMsg;
		
	}

}
