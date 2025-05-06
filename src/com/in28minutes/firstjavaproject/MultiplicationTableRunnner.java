package com.in28minutes.firstjavaproject;

public class MultiplicationTableRunnner {

	public static void main(String[] args) {
		MultiplicationTable table = new MultiplicationTable();
		table.print();
		
		MultiplicationTable generalTable = new MultiplicationTable();
		generalTable.generalPrint(3);

	}

}
