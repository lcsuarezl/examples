package com.java.examples.poo.billburger.test;

import com.java.examples.poo.billburger.Burger;
import com.java.examples.poo.billburger.Carrot;
import com.java.examples.poo.billburger.Chips;
import com.java.examples.poo.billburger.DeluxeBurger;
import com.java.examples.poo.billburger.Drink;
import com.java.examples.poo.billburger.Tomato;

public class BillsBurgers {
	
	public static void main(String args[]){
		Burger burger = new Burger("Double layer bread", "Buffalo", 12.56d);
		burger.addAdition(new Carrot());
		burger.addAdition(new Tomato()); 
		burger.addAdition(new Drink()); 
		burger.addAdition(new Chips()); 
		burger.getFullPrice();
		
		DeluxeBurger deluxeBurger = new DeluxeBurger("Toasted bread", "Red", 23.4d);
		
		deluxeBurger.getFullPrice();
	}

}
