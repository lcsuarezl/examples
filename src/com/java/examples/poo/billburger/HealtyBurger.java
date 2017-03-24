package com.java.examples.poo.billburger;

public class HealtyBurger extends Burger {

	protected IItem aditionFive;
	protected IItem aditionSix;

	public HealtyBurger(String breadRollType, String meat, double price) {
		super(breadRollType, meat, price);
		this.setName("Healty");
	}
	
	@Override
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
		if (this.aditionFive != null) {
			System.out.println("Adition " + this.aditionFive.getName() + " cost:" + this.aditionFive.getPrice());
			total += this.aditionFour.getPrice();
		}
		if (this.aditionSix != null) {
			System.out.println("Adition " + this.aditionSix.getName() + " cost:" + this.aditionSix.getPrice());
			total += this.aditionSix.getPrice();
		}

		System.out.println("Total price :" + total);
	}

	@Override
	public int addAdition(IItem adition) {
		// TODO Auto-generated method stub
		int superResult = super.addAdition(adition);
		if (superResult == -1) {
			if (aditionFive == null) {
				aditionFive = adition;
				return 5;
			} else if (aditionSix == null) {
				aditionSix = adition;
				return 6;
			} else {
				return -1;
			}
		} else {
			return superResult;
		}
	}

}
