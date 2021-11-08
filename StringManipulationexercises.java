package com.qa.qacommunity;

public class StringManipulationexercises {
	public static void main(String [] args) {
		String str1 = "yesterday it was raining";
		String str2 = "today it is sunny";
		
		System.out.println(str2.toUpperCase() + ", " + str1.toUpperCase());
		
		System.out.println(str2.substring(0,11).toUpperCase()+str1.substring(16,24).toUpperCase());
			
	}
}
