package com.java.examples.access.library;

public class CourseBook extends Book{
	
	public CourseBook(){
		//Inheritance
		//public 
		isbn ="3222";
		printBook();
		//protected
		author = "Tom";
		modifyTemplate();
		//package
		issues=2;
		solved();
		//private not allowed
		//pages =10;
		//count();
		
		//Instanciation
		Book book= new Book();
		//public 
		book.isbn ="12345";
		book.printBook();
		//protected
		
		book.author="author";
		book.modifyTemplate();
		//package
		book.issues=2;
		book.solved();
		//privated
		//book.pages=10;
		//book.count();
		
	}
}
