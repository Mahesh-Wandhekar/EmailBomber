package com.nt.Services;

import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.Bind.Bind;
import com.nt.Utlity.EmailSender;

@Service
public class EmailServices {

	@Autowired
	private EmailSender emailSender;
	
	public boolean emailServices(Bind bind) throws Exception {
		
		int num=bind.getNum();
		
		for(int i=0;i<=num;i++) {
		
		Random random = new Random();
        Integer otp = 1000 + random.nextInt(9000);
      
		String to = bind.getEmail();
		String subject = "Heyy...Hello!";
		StringBuffer body = new StringBuffer("");
		body.append("<h1>I am .......!</h1>");
		body.append("<p>Hello Mr/Miss Your Mobile Is Hacked .... !</p>");
		body.append(" OTP :  " +otp);
		body.append("<br>");
		emailSender.sendMail(to, subject, body.toString());
		
		}
		return true;
	}
}
