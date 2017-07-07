package com.java.examples.non.access.statik;

public class Emp {

	public static final int MIN_AGE=20;
	public static final int MAX_AGE=70;	
	String name;
	static int bankVault;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public static int getBankVault() {
		return bankVault;
	}
	public static void setBankVault(int bankVault) {
		Emp.bankVault = bankVault;
	}

}
