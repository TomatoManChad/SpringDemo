package com.luv2code.springdemo.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	
	@RequestMapping("/") //this goes to the /main-menu html page
	public String showPage() { //method name be anything
		return "main-menu"; //takes to main-menu html
	}
	
}
