package com.java.examples.cicles;

public class CiclesWhile {

	public static void main(String args[]) {
		int count = 1;

		while (count != 6) {
			System.out.println("Count value is " + count);
			count++;
		}

		int number = 5;
		int finishNumber = 20;

		int totalEvenNumbers = 0;

		while (number <= finishNumber) {
			if (!isEvenNumber(number)) {
				number++;
				continue;
			} else {
				totalEvenNumbers++;
				
			}
			if(totalEvenNumbers == 5){
				break;
			}
			System.out.println("Even number " + number);
			number++;
		}
		System.out.println("Total even number was:"+totalEvenNumbers);

	}

	public static boolean isEvenNumber(int number) {
		if ((number % 2) == 0) {
			return true;
		}
		return false;
	}
}
