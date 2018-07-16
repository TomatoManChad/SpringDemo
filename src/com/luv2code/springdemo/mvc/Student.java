package com.luv2code.springdemo.mvc;

import java.util.LinkedHashMap;

public class Student {
	
	private String firstName;
	private String lastName;
	private String country;
	private LinkedHashMap <String, String> countryOptions;
	private String favouriteLanguage;
	private LinkedHashMap <String, String> languageOptions;
	private String[] operatingSystems;
	
	public Student() {
		
		//populate country options
		countryOptions = new LinkedHashMap<>();
		languageOptions = new LinkedHashMap<>();
		
		
		countryOptions.put("BR", "Brazil");
		countryOptions.put("FR", "France");
		countryOptions.put("DE", "Germany");
		countryOptions.put("IN", "India");
		countryOptions.put("US", "USA");	
		
		languageOptions.put("Java", "Java");
		languageOptions.put("c£", "c£");
		languageOptions.put("PHP", "PHP");
		languageOptions.put("Ruby", "Ruby");
		languageOptions.put("Python", "Python");
		
	}

	//setters and getters used in the jsp file path for student-form and student-confirmation
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

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public LinkedHashMap<String, String> getCountryOptions() {
		return countryOptions;
	}

	public String getFavouriteLanguage() {
		return favouriteLanguage;
	}

	public void setFavouriteLanguage(String favouriteLanguage) {
		this.favouriteLanguage = favouriteLanguage;
	}

	public LinkedHashMap<String, String> getLanguageOptions() {
		return languageOptions;
	}

	public String[] getOperatingSystems() {
		return operatingSystems;
	}

	public void setOperatingSystems(String[] operatingSystems) {
		this.operatingSystems = operatingSystems;
	}
	
}
