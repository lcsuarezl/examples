package com.java.patterns.behavioral.observer;

public class User implements Observer{


	private String name;
	
	private Observable observable;
	
	public User(String name) {
		this.name=name;
		observable.addObserver(this);
	}
	
	public User(String name, Observable observable) {
		this.name=name;
		this.observable = observable;
		observable.addObserver(this);
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void buyDress() {
		System.out.println("Buy dress color ");
	}
	
	@Override
	public void update() {
		System.out.println(name+" is being updated about the new price for:" + observable.toString());
	}

	@Override
	public String toString() {
		return "User [name=" + name + "]";
	}
	
}
