package com.java.patterns.behavioral.observer;

public class Demo {
	
	
	public static void main(String[] args) {
		
		System.out.println("Start demo observer");
		Dress black = new Dress(Color.BLACK, 10);
		Dress green = new Dress(Color.GREEN, 20);
		Dress blue = new Dress(Color.BLUE, 30);
		//Dress red = new Dress(Color.RED, 12);
		//Dress yellow = new Dress(Color.YELLOW, 23);
	
		/*
		User u1 = new User("User One");
		User u2 = new User("User two");
		User u3 = new User("User tree");
		User u4 = new User("User four");
		User u5 = new User("User five");
		User u6 = new User("User six");
		User u7 = new User("User seven");
		*/
		
		User u1 = new User("User One", black);
		User u2 = new User("User two", green);
		User u3 = new User("User tree", green);
		User u4 = new User("User four", green);
		User u5 = new User("User five", green);
		User u6 = new User("User six",  blue);
		User u7 = new User("User seven", black);
		
		
		/*
		black.addObserver(u1);
		black.addObserver(u7);
		
		green.addObserver(u2);
		green.addObserver(u3);
		green.addObserver(u4);
		green.addObserver(u5);
		
		blue.addObserver(u6);
		blue.addObserver(u7);
		*/
		
		black.setPrice(87);
		green.setPrice(23);
		blue.setPrice(56);
		black.setPrice(8);
		green.setPrice(2);
		blue.setPrice(5);
		black.setPrice(7);
		green.setPrice(3);
		blue.setPrice(6);
	
		black.removeObserver(u1);
		green.removeObserver(u2);
		
		black.setPrice(44);
		green.setPrice(23);
		
		System.out.println("Finish demo observer");
		
	}
	

	
}