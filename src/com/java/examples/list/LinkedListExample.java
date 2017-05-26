package com.java.examples.list;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListExample {

	
	public static void main(String[] args) {
		LinkedList<String> placesToVisit = new LinkedList<String>();
		placesToVisit.add("Bogota");
		placesToVisit.add("Barranquilla");
		placesToVisit.add("Cartagena");
		placesToVisit.add("Leticia");
		placesToVisit.add("Villavicencio");
		placesToVisit.add("Medellin");
		
		
		printList(placesToVisit);
		
	}
	
	public static void printList(LinkedList<String> list){
		 Iterator<String> it = list.iterator();
		 while (it.hasNext()){
			 System.out.println("Vistiando "+it.next());
		 }
		 System.out.println("Terminado ");
	}

}
