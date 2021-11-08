package com.qa.qacommunity;

public class ConditionalDemo {

	public static void main(String[] args) {
		numberIsGreaterThan(5);
}

	public static void numberIsGreaterThan(int num) {
		
		//PRINT OUT "HELLO" IF NUM IS GREATER THAN 2
		if(num>5) {
			System.out.println("HELLO");
		//PRINT OUT "FRIENDS" IF NUM IS GREATER THAN 7
		} else if(num>7) {
			System.out.println("FRIENDS");
		} else {
			System.out.println("BYE");
		}
	}
}