package com.java.examples.access.library;

import com.java.examples.access.building.Curtain;
//not allowed
//import com.java.examples.access.building.PkgCurtain;

public class Librarian {

	public Librarian() {
		// Instanciation
		Book book = new Book();
		// public
		book.isbn = "12345";
		book.printBook();
		// protected

		book.author = "author";
		book.modifyTemplate();
		// package
		book.issues = 2;
		book.solved();
		Curtain curt = new Curtain(); 
		//Not allowed package access outside of source´s package
		//PkgCurtain pkg = new PkgCurtain();
		
	}

}
