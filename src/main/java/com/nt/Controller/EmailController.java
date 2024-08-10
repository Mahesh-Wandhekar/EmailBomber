package com.nt.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.nt.Bind.Bind;
import com.nt.Services.EmailServices;

@Controller
public class EmailController {
	
	@Autowired
	private EmailServices emailServices;
	
	@GetMapping("/")
	public String  email( Model model ,Bind bind) {
		
		model.addAttribute("bind",bind);
		
		return "email";
	}
	
	@PostMapping("email")
	public String  emailPost( @ModelAttribute("bind") Bind bind , Model model) throws Exception {
		
		System.out.println(bind);
		boolean status=emailServices.emailServices(bind);
		if(status) {
			model.addAttribute("sucmsg","Sending Email is Happen...!");
		}else {
			model.addAttribute("errmsg","Sending Email is Happen...!");
			
		}
		
		
		return "email";
	}

}
