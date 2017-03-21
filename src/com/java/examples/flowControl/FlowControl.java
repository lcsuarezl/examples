package com.java.examples.flowControl;

public class FlowControl {

	public static void main(String[] args) {

		ifThenElseExample();
	}

	private static void ifThenElseExample() {
		int var = 50;

		if (var != 50)
			System.out.println("This code is executer");
		System.out.println("But this is also executed?");
		System.out.println("or this? ");
		
		switchExample();
		switchMonthExample() ;
	}

	private static void switchExample() {
		char val = 'G';

		switch (val) {
		case 'A':
			System.out.println("Value was " + val);
			break;
		case 'B':
			System.out.println("Value was " + val);
			break;
		case 'C':
			System.out.println("Value was " + val);
			break;
		case 'D':
			System.out.println("Value was " + val);
			break;
		case 'E': case 'F':case 'G':
			System.out.println("Value was " + val);
			break;
		default:
			System.out.println("No one of the above!!");
			break;

		}

	}
	
	
	private static void switchMonthExample() {
		String val = "Jully";

		switch (val) {
		case "January":
			System.out.println("Value was " + val);
			break;
		case "February":
			System.out.println("Value was " + val);
			break;
		case "March":
			System.out.println("Value was " + val);
			break;
		case "April":
			System.out.println("Value was " + val);
			break;
		case "May": case "June":case "Jully":
			System.out.println("Value was " + val);
			break;
		default:
			System.out.println("No one of the above!!");
			break;

		}

	}
}
