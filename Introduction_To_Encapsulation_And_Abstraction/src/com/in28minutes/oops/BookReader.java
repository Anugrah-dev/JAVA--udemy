package com.in28minutes.oops;

public class BookReader {
	public static void main(String[] args) {
		// Create a new class Book
		// create three instances
		Book artOfComputerPrograming = new Book();
		Book effectiveJava = new Book();
		Book cleanCode = new Book();

		artOfComputerPrograming.counter(5);
		effectiveJava.counter(4);
		cleanCode.counter(8);
	}
}
