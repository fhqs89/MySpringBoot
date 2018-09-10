package com.ribbon.server.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class ConsumerController {

	@Autowired
	RestTemplate restTemplate;
	
	@RequestMapping(value="/ribbon-service",method=RequestMethod.GET)
	public String helloConsumer() {
		return restTemplate.getForEntity("http://HELLO-SERVICE/test/method", String.class).getBody();
	}
	
	
}
