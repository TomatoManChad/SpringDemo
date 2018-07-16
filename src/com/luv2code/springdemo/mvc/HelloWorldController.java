package com.luv2code.springdemo.mvc;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/hello")
public class HelloWorldController {
	
	//need a controller method to show initial HTML form
	@RequestMapping("/showForm") /// showForm is mapping for helloworld-form
	public String showForm() {
		return "helloworld-form"; //this is returning the name of the html page when /showForm is entered
	}
	
	
	//need a controller method to process the HTML form
	@RequestMapping("/processForm") //again, this is url address- but helloworld is the jsp/html file
	public String processForm() {
		return "helloworld"; //takes you to helloworld html
	}
	
	
	//controller method to read form data and add data to the model
	@RequestMapping("/processFormVersionTwo")
	public String makeCapital(HttpServletRequest request, Model model) {
		
		//read the request parameter from the html form
		String theName = request.getParameter("studentName"); //gets name entered
		
		//convert to uppercase
		theName = theName.toUpperCase();
		
		//create the message
		String result = "Hello " + theName;
		
		//add message to the model
		model.addAttribute("message", result);
		
		return "helloworld";
	}
	
	@RequestMapping("/processFormVersionThree")
	public String vThree(@RequestParam("studentName") String theName,Model model) { //reading straight from form parameter called "studentName"
		
		//read the request parameter from the html form
		//String theName = request.getParameter("studentName"); no longer needed as reading directly from above statement
		
		//convert to uppercase
		theName = theName.toUpperCase();
		
		//create the message
		String result = "Hello there " + theName;
		
		//add message to the model
		model.addAttribute("message", result);
		
		return "helloworld";
	}
}
