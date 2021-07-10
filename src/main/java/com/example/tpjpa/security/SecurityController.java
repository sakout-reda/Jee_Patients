package com.example.tpjpa.security;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller

public class SecurityController {
	@GetMapping("/notAutorized")
	
	public String error() {
		return "notAutorized";
	}
	@GetMapping("/login")
	
	public String login() {
		return "login";
	}
	@GetMapping("/logout")
	
	public String logout(HttpServletRequest request) throws ServletException {
		request.logout();
		return "redirect:/login";
	}
}
