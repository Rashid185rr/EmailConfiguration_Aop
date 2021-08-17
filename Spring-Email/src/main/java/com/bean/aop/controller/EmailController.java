package com.bean.aop.controller;


import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.Map;
import java.util.Properties;

import org.apache.commons.configuration.PropertiesConfiguration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.MutablePropertySources;
import org.springframework.core.env.PropertiesPropertySource;
import org.springframework.core.env.PropertySource;
import org.springframework.core.env.StandardEnvironment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.bean.aop.impl.EmailServiceImpl;




@RestController
public class EmailController {
	
	@Autowired
	EmailServiceImpl service;

	@Autowired
	Properties property;
	@RequestMapping("/sendemail")
	public void send() {
		
		
		String to=property.getProperty("to");
		String from=property.getProperty("from");
		String subject=property.getProperty("subject");
		String content=property.getProperty("content");
		
		service.sendEmail(from, to, subject, content);
		System.out.println("called");
	}
	
	

}