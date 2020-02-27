package com.luv2code.springdemo.mvc;

import java.util.LinkedHashMap;

public class Student {
	private String firstName;
	private String lastName;
	private String Country;
	private LinkedHashMap<String, String> countryList;

	public Student() {
		// Populate country lists/options using ISO country code
		countryList = new LinkedHashMap<String, String>();
		
		countryList.put("BR", "Brazil");
		countryList.put("FR", "France");
		countryList.put("DE", "Germany");
		countryList.put("IN", "India");
		countryList.put("US", "United States of America");
		countryList.put("ET", "Ethiopia");
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

	public String getCountry() {
		return Country;
	}

	public void setCountry(String country) {
		Country = country;
	}

	public LinkedHashMap<String, String> getCountryList() {
		return countryList;
	}
	
	
	
	

}
