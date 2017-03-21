package com.java.examples.cicles;

public class CiclesFor {

	public static void main(String args[]) {

		//forExample();
		//forReverseExample();
		
		testIsPrime();
	}

	private static void forExample() {
		for (int i = 0; i < 9; i++) {
			System.out.println("10000,00 at " + i + " % interest = " + String.format("%.2f", calculateInterest(10000d, i)));
		}
	}

	
	private static void forReverseExample() {
		for (int i = 8; i >1; i--) {
			System.out.println("10000,00 at " + i + " % interest = " + String.format("%.2f", calculateInterest(10000d, i)));
		}
	}
	
	private static double calculateInterest(double amount, double interestRate) {
		return (amount * (interestRate / 100));
	}
	
	
	
	private static void testIsPrime(){
		int isPrime =0;
		
		for(int i=0;i<100;i++){
			if(isPrime(i)){
				isPrime++;
				System.out.println("Prime found for:"+i);
				if(isPrime == 30){
					break;
				}
			}
		}
		
		
	}
	
	
	
	private static boolean isPrime(int n){
		if(n==1){
			return false;
		}
		
		for(int i=2; i<=(long) Math.sqrt(n); i++){
			if(n% i==0){
				return false;
			}
		}
		return true;
	}

}
