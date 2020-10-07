package com.sample.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {
	@GetMapping("/login")
	public String WelcomePage()
	{
		return "login";
	}
@PostMapping("/doLogin")
public String loginProcess(@RequestParam("username")String uname,@RequestParam("password")String pass,Model model)
{
	System.out.println(uname);
	System.out.println(pass);
	if(pass.equals("admin"))
	{
	return "success";
	}
	else
	{
		return "failure";
		}
	
	}
}
