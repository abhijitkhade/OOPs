package com.prowing.assosiation;

public class AdressStudent {
	String city;
	String country;
	int pin;
	
	public AdressStudent() {
		super();
	}
	public AdressStudent(String city, String country, int pin) {
		super();
		this.city = city;
		this.country = country;
		this.pin = pin;
	}
	@Override
	public String toString() {
		return "AdressStudent [city=" + city + ", country=" + country + ", pin=" + pin + "]";
	}

}
