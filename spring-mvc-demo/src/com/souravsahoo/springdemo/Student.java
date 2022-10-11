package com.souravsahoo.springdemo;

import java.util.HashMap;

/**
 * POJO class to hold form data
 * 
 * @author jacky
 *
 */
public class Student {

	private String firstName, lastName;
	private String country;
	private HashMap<String, String> countryOptions;
	
	public Student() {

		countryOptions = new HashMap<>();
		countryOptions.put("BR", "Brazil");
		countryOptions.put("IN", "India");
		countryOptions.put("US", "America");
		countryOptions.put("UK", "United kingdom");
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
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public HashMap<String, String> getCountryOptions() {
		return countryOptions;
	}

	
}
