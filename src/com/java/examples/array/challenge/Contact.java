package com.java.examples.array.challenge;

public class Contact {

	private String name;
	private String phone;

	public Contact() {
		super();
	}

	public Contact(String name, String number) {
		super();
		this.name = name;
		this.phone = number;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	@Override
	public String toString() {
		return "Contact [name=" + name + ", phone=" + phone + "]";
	}
	
	

}
