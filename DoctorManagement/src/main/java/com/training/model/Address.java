package com.training.model;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@ToString

public class Address {
	private String addressLine1;
	private String city;
	private long pinCode;

}
