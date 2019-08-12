package com.training;

public class Item {
	private String itemNumber;
	private String itemName;
	private double rate;
	private int quantity;
	public Item(String itemNumber, String itemName, double rate, int quantity) {
		super();
		this.itemNumber = itemNumber;
		this.itemName = itemName;
		this.rate = rate;
		this.quantity = quantity;
	}
	@Override
	public String toString() {
		return "Item [itemNumber=" + itemNumber + ", itemName=" + itemName + ", rate=" + rate + ", quantity=" + quantity
				+ "]";
	}

}
