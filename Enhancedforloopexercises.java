package com.qa.qacommunity;

public class Enhancedforloopexercises {
	public static void main(String[] args) {

//	exercise 1
//	String [] rainbowColours = {"Red", "Orange", "Yellow", "Blue"};
//	
//	for (String colours : rainbowColours) {
//		System.out.println(colours);
//		}

////	exercise 2
		int[] numbersArray = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20 };

//		for (int numbers : numbersArray) {
//			System.out.println(numbers * numbers);
//		}
		
		for (int i : numbersArray) {
			if (evenCheck(i)) {
				System.out.println("Even" + i*i*i);
			} else {
				System.out.println("Odd" + i*i);
			}
		}
	}
	
//	exercise 3

	public static boolean evenCheck(int num) {
		if (num % 2 == 0) {
			return true;
		} else {
			return false;
		}

	}
}
