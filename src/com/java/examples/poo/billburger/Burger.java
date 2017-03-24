package com.java.examples.poo.billburger;

public class Burger implements IItem {

	private String breadRollType;
	private String meat;
	protected double price;
	protected String name;
	protected IItem aditionOne;
	protected IItem aditionTwo;
	protected IItem aditionTree;
	protected IItem aditionFour;

	public Burger(String breadRollType, String meat, double price) {
		super();
		this.breadRollType = breadRollType;
		this.meat = meat;
		this.price = price;
		this.name="Basic"; 
	}

	public void getFullPrice() {
		double total = 0d;
		System.out.println("Burger " + this.name + " cost:" + this.price);
		total += this.price;
		if (this.aditionOne != null) {
			System.out.println("Adition " + this.aditionOne.getName() + " cost:" + this.aditionOne.getPrice());
			total += this.aditionOne.getPrice();
		}
		if (this.aditionTwo != null) {
			System.out.println("Adition " + this.aditionTwo.getName() + " cost:" + this.aditionTwo.getPrice());
			total += this.aditionTwo.getPrice();
		}
		if (this.aditionTree != null) {
			System.out.println("Adition " + this.aditionTree.getName() + " cost:" + this.aditionTree.getPrice());
			total += this.aditionTree.getPrice();
		}
		if (this.aditionFour != null) {
			System.out.println("Adition " + this.aditionFour.getName() + " cost:" + this.aditionFour.getPrice());
			total += this.aditionFour.getPrice();
		}

		System.out.println("Total price :" + total);
	}

	public int addAdition(IItem adition) {
		if (aditionOne == null) {
			aditionOne = adition;
			return 1;
		} else if (aditionTwo == null) {
			aditionTwo = adition;
			return 2;
		} else if (aditionTree == null) {
			aditionTree = adition;
			return 3;
		} else if (aditionFour == null) {
			aditionFour = adition;
			return 4;
		} else {
			return -1;
		}
	}

	public String getBreadRollType() {
		return breadRollType;
	}

	public void setBreadRollType(String breadRollType) {
		this.breadRollType = breadRollType;
	}

	public String getMeat() {
		return meat;
	}

	public void setMeat(String meat) {
		this.meat = meat;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
