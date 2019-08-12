package com.example.demo.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Store {

	private long storeId;
	private String location;
	private String storageIncharge;
	private double yearlyTarget;
}
