package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
 
@Controller
public class GreetingController {
	@RequestMapping("/Greeting")
	public String sayHello1() {
		return "Greeting";
	}
}