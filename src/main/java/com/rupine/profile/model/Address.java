package com.rupine.profile.model;

public class Address {

	private String city;
	private String cournty;
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getCournty() {
		return cournty;
	}
	public void setCournty(String cournty) {
		this.cournty = cournty;
	}
	
	public Address(String city, String country) {
		// TODO Auto-generated constructor stub
		this.city=city;
		this.cournty=country;
	}
	
}
