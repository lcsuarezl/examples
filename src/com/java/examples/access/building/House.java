package com.java.examples.access.building;

import com.java.examples.access.library.Book;

public class House {
	public House() {
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
