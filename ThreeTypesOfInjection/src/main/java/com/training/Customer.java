package com.training;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString

public class Customer {

		private String customerName;
		private long customerId;
		private String email;
		private long phoneNumber;
		
		//field injection -tries by type or name
		@Autowired
		@Qualifier("billingAddress")
		private Address address;
		
}
