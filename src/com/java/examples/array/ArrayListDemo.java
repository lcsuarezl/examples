package com.java.examples.array;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListDemo {

	private static GroceryList groceryList = new GroceryList();
	private static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		boolean quit = false;
		int choice = 0;
		do {
			switch (choice) {
			case 0:
				printMenu();
				break;
			case 1:
				groceryList.printList();
				break;
			case 2:
				addGrocery();
				break;
			case 3:
				updateGrocery();
				break;
			case 4:
				deleteGrocery();
				break;
			}
			printMenu();
			choice = scanner.nextInt();
		} while (!quit);

	}

	public static void printMenu() {
		System.out.println("0. Show menu");
		System.out.println("1. Print list");
		System.out.println("2. Add Grocery");
		System.out.println("3. Update Grocery");
		System.out.println("4. Delete Grocery");
	}

	private static void addGrocery() {
		System.out.println("Add Grocery name:");
		String grocery = scanner.next();
		groceryList.addGrocery(grocery);
		groceryList.printList();
	}

	private static void findGrocery() {
		System.out.println("Find Grocery name:");
		String grocery = scanner.nextLine();
		groceryList.findItem(grocery);
	}

	private static void updateGrocery() {
		System.out.println("Update Grocery name: \nIndex:");
		int index = scanner.nextInt();
		System.out.println("Grocery  name:");
		String grocery = scanner.next();
		groceryList.updateGrocery(index, grocery);
		groceryList.printList();
	}

	private static void deleteGrocery() {
		System.out.println("Delete Grocery name:");
		String grocery = scanner.next();
		int index = groceryList.getItemIndex(grocery);
		groceryList.removeGrocery(index);
		groceryList.printList();
	}
	
	/**
	 * Simulate the copy betewwn arrays
	 * @param array
	 */
	private static void copyArray( ArrayList<String> array ){
		ArrayList<String> otherList = new ArrayList<String>();
		otherList.addAll(array);
		
		String[] stringArray = new String[array.size()];
		stringArray = array.toArray(stringArray);
	}

}
