package com.training;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Product {
 private long producteCode;
 private String producteName;
 private double quantity;
 private double ratePerUnit;
 
}
