package com.java.examples.poo.account;

public class VipCustomer {

	private String name;
	private String emailAddress;
	private double creditLimit;

	public VipCustomer() {
		this("default name", "default@email.com", 2500);
	}

	public VipCustomer(String name, String emailAddress) {
		this(name, emailAddress, 15000);
	}

	public VipCustomer(String name, String emailAddress, double creditLimit) {
		super();
		this.name = name;
		this.emailAddress = emailAddress;
		this.creditLimit = creditLimit;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public double getCreditLimit() {
		return creditLimit;
	}

	public void setCreditLimit(double creditLimit) {
		this.creditLimit = creditLimit;
	}

}
