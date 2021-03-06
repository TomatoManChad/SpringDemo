package com.luv2code.springdemo.mvc;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import com.luv2code.springdemo.mvc.validation.CourseCode;

public class Customer {
	private String firstName;
	
	
	// adding lastName spring validation rules
	@NotNull (message="is required")
	@Size(min=1, message="is required")
	private String lastName;
	
	
	@NotNull (message="is required")
	@Max(value = 10,message="must be lesser or equal to 10")
	@Min(value = 0,message="must be greater or equal to 0")
	private Integer freePasses;
	
	
	@Pattern(regexp = "^[a-zA-Z0-9]{7}", message="only 7 characters/digits long")
	private String postCode;
	
	@CourseCode
	private String courseCode;
	
	public Customer () {
		
	}
	
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Integer getFreePasses() {
		return freePasses;
	}


	public void setFreePasses(Integer freePasses) {
		this.freePasses = freePasses;
	}


	public String getPostCode() {
		return postCode;
	}

	public void setPostCode(String postCode) {
		this.postCode = postCode;
	}


	public String getCourseCode() {
		return courseCode;
	}


	public void setCourseCode(String courseCode) {
		this.courseCode = courseCode;
	}
	
	
}
