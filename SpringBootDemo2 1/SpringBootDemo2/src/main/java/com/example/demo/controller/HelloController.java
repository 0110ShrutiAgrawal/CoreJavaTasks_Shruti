package com.example.demo.controller;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloController {
 
	@GetMapping("/display")
	public String display(@RequestParam(name="name",required=false)String name,Model m)
	{
		m.addAttribute("name",name);
		return "Hello";	
	}
}
