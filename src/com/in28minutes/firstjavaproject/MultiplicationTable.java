package com.in28minutes.firstjavaproject;

public class MultiplicationTable {
	void print() {
		for (int i = 1; i <= 10; i++) {
			System.out.printf("%d * %d = %d", 5, i, 5*i).println();
		}
	}
	void generalPrint(int num) {
		for (int i = 1; i <= 10; i++) {
			System.out.printf("%d * %d = %d", num, i, num*i).println();
		}
	}
	
}
