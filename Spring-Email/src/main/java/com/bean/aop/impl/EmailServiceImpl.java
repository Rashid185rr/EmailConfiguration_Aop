package com.bean.aop.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;
 

@Service
public class EmailServiceImpl {

	@Autowired
    private JavaMailSender javaMailSender;
 
	public void sendEmail(String fromEmail, String toEmail, String sub, String body) {
		 
		SimpleMailMessage msg = new SimpleMailMessage();
	        msg.setTo(fromEmail, toEmail);
	        msg.setSubject(sub);
	        msg.setText(body);
	        javaMailSender.send(msg);
	
		
	}

}
