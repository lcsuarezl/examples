package com.java.examples.access.building;

import com.java.examples.access.library.Book;

public class StoryBook extends Book {

	public StoryBook() {
		// Inheritance
		// public
		isbn = "3222";
		printBook();
		// protected
		author = "Tom";
		modifyTemplate();
		// package fail
		// issues=2;
		// solved();

		// Instanciation
		Book book = new Book();
		// public
		book.isbn = "12345";
		book.printBook();
		// protected fail
		// book.author="author";
		// book.modifyTemplate();
		// package fail
		// book.issues=2;
		// book.solved();
	}

}
