package com.ezen.view.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginViewController{
	
	@RequestMapping("loginView.do")
	public String handleRequest() {
	
	return "login.jsp";
	}
	
}
