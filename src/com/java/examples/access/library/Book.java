package com.java.examples.access.library;

public class Book {
	
	//public access 
	public String isbn;
	//protected access
	protected String author;
	//default ~ package
	int issues; 
	//private
	private int pages; 
	
	public void printBook(){
		System.out.println("printBook()");
	}

	protected void modifyTemplate(){
		System.out.println("modifyTemplate()!");
	}
	
	void solved(){
		System.out.println("solved()!");
	}
	
	private void count(){
		System.out.println("count()!");
	}
}
