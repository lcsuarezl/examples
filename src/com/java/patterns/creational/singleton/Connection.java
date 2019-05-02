package com.java.patterns.creational.singleton;

public class Connection {
	
	private Connection instance;
	private int count;
	
	private Connection() {
		this.count++;
	}
	
	public Connection getInstance() {
		if(this.instance != null){
				return this.instance;
		}
		this.instance = new Connection();
		return this.instance;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

}
