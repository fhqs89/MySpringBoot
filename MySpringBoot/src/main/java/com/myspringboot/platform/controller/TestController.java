package com.myspringboot.platform.controller;

import org.springframework.beans.factory.annotation.Autowired;
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
	
	
	@RequestMapping(path="/method",method=RequestMethod.GET)
	@ResponseBody
	public String testMethod(String msg) {
		return "This is my spring-boot!" + msg;
	}
}
