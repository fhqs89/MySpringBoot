package com.myspringboot.platform.controller;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.cloud.client.ServiceInstance;
//import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.myspringboot.platform.service.TestService;


@Controller
@RequestMapping(value = "/test")
public class TestController {

	@Autowired
	TestService testService;
	
//	@Autowired
//	private DiscoveryClient client;
	
	@RequestMapping(path="/method",method=RequestMethod.GET)
	@ResponseBody
	public String testMethod(String msg) {
//		ServiceInstance instance = client.getLocalServiceInstance();
//		System.out.println("/method,host:"+instance.getHost() + ",serveice_id:" + instance.getServiceId());
		return "This is my spring-boot!";
	}
}
