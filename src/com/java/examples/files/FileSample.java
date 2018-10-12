package com.java.examples.files;

import java.util.NoSuchElementException;
import java.util.Scanner;

public class FileSample {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 String line;
		 int counter = 1;
		 do {
			 try {
			 line = sc.nextLine();
			 System.out.println((counter++)+" "+line);
			 }catch (NoSuchElementException e) {
			}
		 }
		 while(sc != null);
		 sc.close();
	 }

}
