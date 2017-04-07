package com.java.examples.array;

import java.util.Scanner;

public class SortArray {

	private static Scanner scanner = new Scanner(System.in);

	public static void main(String args[]) {
		System.out.println("Please enter the size\r");
		// int size = scanner.nextInt();
		int myInt[] = { 3, 54, 6, 23, 76, 12, 43, 56, 10, 32, 51, 87, 40, 88, 94, 17, 48, 41 };
		// getIntegers(size);
		// printArray(myInt);
		int sum = getSum(myInt);
		System.out.println("The average of array is " + sum / myInt.length);
		bubbleSortArray(myInt);
		selectionSortDescArray(myInt);
		selectionSortAscArray(myInt);
		// printArray(myInt);
		insertionSortDesc(myInt);
	}

	private static int[] getIntegers(int size) {
		System.out.println("Please enter " + size + " integer numbers\r");
		int[] array = new int[size];
		for (int i = 0; i < size; i++) {
			array[i] = scanner.nextInt();
		}
		return array;
	}

	private static int getSum(int[] array) {
		int sum = 0;
		for (int i = 0; i < array.length; i++) {
			sum += array[i];
		}
		return sum;
	}

	private static void printArray(int[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.println(" number at " + i + " is " + array[i]);
		}
	}

	private static void print(int[] array) {
		System.out.print("{");
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + ",");
		}
		System.out.print("}\n");
	}

	private static void swapNumbers(int i, int j, int[] array) {
		int temp = array[i];
		array[i] = array[j];
		array[j] = temp;
	}

	private static void bubbleSortArray(int array[]) {
		System.out.println("Bubble sort:");
		print(array);
		int n = 0;
		for (int j = 0; j < array.length; j++) {
			for (int i = 0; i < array.length && j < array.length; i++) {
				n++;
				if (array[i] > array[j]) {
					swapNumbers(i, j, array);
				}
			}
		}
		print(array);
		System.out.println("size:" + array.length + " n:" + n);
	}
	
	

	private static void selectionSortDescArray(int array[]) {
		System.out.println("Selection sort desc:");
		print(array);
		int n = 0;
		for (int j = 0; j < array.length; j++) {
			int max = j;
			for (int i = j; i < array.length; i++) {
				n++;
				if (array[max] < array[i]) {
					max = i;
				}
			}
			swapNumbers(j, max, array);
		}
		print(array);
		System.out.println("size:" + array.length + " n:" + n);
	}

	/**
	 * 
	 * @param array
	 */
	private static void selectionSortAscArray(int array[]) {
		System.out.println("Selection sort asc:");
		print(array);
		int n = 0;
		for (int j = 0; j < array.length; j++) {
			int min = j;
			for (int i = j; i < array.length; i++) {
				n++;
				if (array[min] > array[i]) {
					min = i;
				}
			}
			swapNumbers(min, j, array);
		}
		print(array);
		System.out.println("size:" + array.length + " n:" + n);
	}

	/**
	 * removes the element at i from the array;
	 * 
	 * @return
	 */
	private static int[] remove(int[] array, int k) {
		int[] aux = new int[array.length - 1];
		int j = 0;
		for (int i = 0; i < array.length; i++) {
			if (i != k) {
				aux[j] = array[i];
				j++;
			}
		}
		return aux;
	}

	/**
	 * http://www.java2novice.com/java-sorting-algorithms/insertion-sort/
	 * @param array
	 */
	private static void insertionSortDesc(int[] array) {
		System.out.println("Selection sort asc:");
		print(array);
		int[] sorted = new int[array.length];
		int index = 0;
		int n=0; 
		int size=array.length;
		for (int j = 0; j <size ; j++) {
			int min=0;
			for (int i = 0; i < array.length; i++) {
				n++;
				if(array[min]<array[i]){
					min=i;
				}
			}
			sorted[index]=array[min]; 
			array= remove(array, min);
			index ++;
		}
		print(sorted);
		System.out.println("size:" + array.length + " n:" + n);
	}
}
