package com.java.examples.array;

import java.util.Scanner;

public class ReadArray {

	private static Scanner scanner = new Scanner(System.in);

	public static void main(String args[]) {
		int myInt[] = getIntegers(4);
		for (int i = 0; i < myInt.length; i++) {
			System.out.println(" typed number at " + i + " was " + myInt[i]);
		}
	}

	private static int[] getIntegers(int size) {
		System.out.println("Please enter " + size + " integer numbers\r");
		int[] array = new int[size];
		for (int i = 0; i < size; i++) {
			array[i] = scanner.nextInt();
		}
		return array;
	}

}
