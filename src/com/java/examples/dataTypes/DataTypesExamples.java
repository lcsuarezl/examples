package com.java.examples.dataTypes;

public class DataTypesExamples {
	
	public static void main(String args[]) {

		numberDataTypes1();
		floatingNumberExample();
		charAndbolleanExample();
		 numberIntSize();
		 numberLongTest();
	}

	
	private static void numberDataTypes1(){
		
		byte byteVar = 127; 
		short shortVar = 32000;
		int intVar = 2345254;
		long longVar = 50000L + 10L * (byteVar + shortVar + intVar);
		System.out.println("Total: " + longVar);
		
	}
	
	private static void numberIntSize(){
		int intVar = 2; 
		for(byte i=1; i<31; i++){
			System.out.println("2\u005E" + i + "=" + intVar );
			intVar *=2; 
		}
		intVar=(intVar-1);
		System.out.println("2\u005E32=" + intVar );
	}
	
	
	private static void numberLongTest(){
		long longVar = 2_9_9_8____98_99_89_23_2L; 
		for(byte i=1; i<31; i++){
			System.out.println("doubled " + i + " times =" + longVar );
			longVar *=2; 
		}
	}
	
	private static void floatingNumberExample(){
		
		double pounds = 10d;
		float kilograms = 2f; 
		
		double pound2kilo = 0.45359237; 
		
		System.out.println(pounds + " pounds to kilo equals "+ pounds*pound2kilo + " kilograms");
		
		System.out.println(kilograms + " kilo to pounds equals "+ kilograms/pound2kilo + " pounds");
	}
	
	
	private static void charAndbolleanExample(){
		
		char arrow='\u0040';

		System.out.println("Symbol fo arrow in unicode is \\u0040 : " + arrow);
	}
}
