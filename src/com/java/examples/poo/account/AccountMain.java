package com.java.examples.poo.account;

public class AccountMain {
	
	
	public static void main(String args[]){
		
		Account bobsAccount = new Account();
		
		System.out.println(bobsAccount.getNumber());
		System.out.println(bobsAccount.getBalance());
		
		bobsAccount.withdrawal(100.0);
		bobsAccount.deposit(50.0);
		bobsAccount.withdrawal(100.0);
		bobsAccount.deposit(51.0);
		bobsAccount.withdrawal(100.0);
	}

}
