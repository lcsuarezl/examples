package com.java.examples.methods;

public class MethodOverload {

	private static double inch2cm = 2.54d;
	private static double feet2inch = 12d;
	private static double feet2cm = inch2cm * feet2inch;

	public static void main(String[] args) {
		
		System.out.println("Calculate 10f 10 inch:"+calcFeetAndInchesToCentimeters(10, 10));
		
		System.out.println("Calculate 6f 0 inch:"+calcFeetAndInchesToCentimeters(6, 0));
		
		System.out.println("Calculate 0f 100 inch:"+calcFeetAndInchesToCentimeters(0, 100));

	}

	public static double calcFeetAndInchesToCentimeters(double feets, double inches) {
		if (feets < 0 || (inches < 0 && inches >0)) {
			return -1;
		}
		double cm = (feets * feet2cm) + (inches*inch2cm);
		return cm;
	}

	public static double calcFeetAndInchesToCentimeters(double inches) {
		if (inches < 0) {
			return -1;
		}
		double feets = (int) (inches / feet2inch);
		double inchs =  (int) (inches % feet2inch);
		return calcFeetAndInchesToCentimeters(feets, inchs);
	}

}
