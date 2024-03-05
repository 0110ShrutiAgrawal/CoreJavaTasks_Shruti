package com.web;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LoginController {
	@RequestMapping("/login")
	public ModelAndView login(HttpServletRequest request, HttpServletResponse response) {
		System.out.println("Login controller");
		String username = request.getParameter("userName");
		String password = request.getParameter("password");
		if (username.length() == 0 || username.equals("")) {
			return new ModelAndView("errorPage", "message", "Invalid username and password");
		}
		if (username.equals("shruti") && password.equals("shruti")) {
			return new ModelAndView("successPage", "message", "Welcome user");
		} else {
			return new ModelAndView("welcome", "message", "Welcome");
		}
	}
}
