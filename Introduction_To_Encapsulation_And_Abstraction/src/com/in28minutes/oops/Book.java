package com.in28minutes.oops;

public class Book {
	private int numberOfCopiesOfBook;

	// a method so that we can use the variable numberOfCopiesOfBook outside the
	// book class

	void counter(int numberOfCopies) {
		numberOfCopiesOfBook = numberOfCopies;
	}
}
