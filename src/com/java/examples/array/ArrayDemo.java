package com.java.examples.array;

public class ArrayDemo {

	public static void main(String args[]) {

		example1();
	}

	public static void example1() {
		int a[][] = new int[3][];
		a[1] = new int[] { 1, 2, 3 };
		a[2] = new int[] { 4, 5 };
		System.out.print(a[1][1]);
	}

}
