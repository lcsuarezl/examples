package com.java.patterns.behavioral.observer;

import java.util.ArrayList;

public class Dress implements Observable {
	
	
	private ArrayList<Observer> users = new ArrayList<Observer>();
	
	private int price; 
	
	public Dress(Color color, int price) {
		super();
		this.color = color;
		this.price = price; 
	}

	private Color color;
	
	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}
	
	

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
		this.notifyObserver();
	}

	@Override
	public void addObserver(Observer o) {
		System.out.println(o.toString() +" added to "+color+ " list");
		users.add(o);
	}
	
	@Override
	public void removeObserver(Observer o) {
		users.remove(o);
		System.out.println(o.toString() +" reoved from "+color+ " list");
	}
	
	@Override
	public void notifyObserver() {
		for (Observer o : users) {
			o.update();
		}		
	}

	@Override
	public String toString() {
		return "Dress [price=" + price + ", color=" + color + "]";
	}
	
	
	
}
