package com.training;

public class Address {

	private String addrLine;
	private String city;
	private long pinCode;
	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Address(String addrLine1, String city, long pinCode) {
		super();
		this.addrLine = addrLine1;
		this.city = city;
		this.pinCode = pinCode;
	}
	
	@Override
	public String toString() {
		return "Address [addrLine=" + addrLine + ", city=" + city + ", pinCode=" + pinCode + "]";
	}
	
	
}
