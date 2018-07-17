package com.luv2code.springdemo.mvc;

import javax.validation.Valid;

import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/customer")
public class CustomerController {
	
	//add initbinder to convert trim input string
	//remove leading and trailing whitespace
	@InitBinder
	public void initBinder(WebDataBinder dataBinder) {
		
		StringTrimmerEditor stringTrimmerEditor = new StringTrimmerEditor(true);
		dataBinder.registerCustomEditor(String.class, stringTrimmerEditor);
	}
	
	
	// this will create a /showForm page that will allow a new customer to fill in
	// details required
	@RequestMapping("/showForm")
	public String showForm(Model theModel) {
		theModel.addAttribute("customer", new Customer());

		return "customer-form";
	}

	@RequestMapping("/processForm")
	public String processForm(@Valid @ModelAttribute("customer") Customer theCustomer, BindingResult theBindingResult) { //if valid, result placed in theBindingResult
	
		
		System.out.println("Last name: "+"["+theCustomer.getLastName()+"]");
		System.out.println("Binding result" + theBindingResult); //printing Binding result will show what error codes are happening in the fields
		
		if(theBindingResult.hasErrors()) { //if error based on validation rules from customer class, return back to customer-form page
			return "customer-form";
		}
		else { //else go to confirm page
		return "customer-confirmation";
		}
	}
}
