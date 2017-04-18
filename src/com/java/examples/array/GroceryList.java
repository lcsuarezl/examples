package com.java.examples.array;

import java.util.ArrayList;

public class GroceryList {

	private ArrayList<String> groceryList = new ArrayList<String>();

	public void addGrocery(String grocery) {
		if (groceryList == null) {
			groceryList = new ArrayList<String>();
		}
		if (grocery != null && !grocery.isEmpty()) {
			groceryList.add(grocery);
		}
	}

	public void printList() {
		System.out.println("Now you have " + groceryList.size() + " elements in your GroceryList");
		for (int i = 0; i < groceryList.size(); i++) {
			System.out.println(" [" + (i + 1) + " ]=>" + groceryList.get(i));
		}
	}

	public void updateGrocery(int index, String grocery) {
		if (index < groceryList.size()) {
			groceryList.set(index, grocery);
		}
	}

	public void removeGrocery(int index) {
		if (groceryList.size() < index) {
			groceryList.remove(index);
		}
	}

	public String findItem(String grocery) {
		int position = groceryList.indexOf(grocery);
		if (position > 0) {
			return groceryList.get(position);
		} else {
			return null;
		}
	}

	public Integer getItemIndex(String grocery) {
		int position = groceryList.indexOf(grocery);
		if (position > 0) {
			return position;
		} else {
			return null;
		}
	}

}
