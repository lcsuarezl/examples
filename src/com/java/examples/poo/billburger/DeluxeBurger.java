package com.java.examples.poo.billburger;

public class DeluxeBurger extends Burger {

	public DeluxeBurger(String breadRollType, String meat, double price) {
		super(breadRollType, meat, price);
		this.setName("Deluxe");
		this.aditionOne = new Chips();
		this.aditionOne.setPrice(0d);
		this.aditionTwo = new Drink();
		this.aditionTwo.setPrice(0d);
	}

}
