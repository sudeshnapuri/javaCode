package com.qa.qacommunity;

public class HelloWorld {
	
	public static void main(String[] args) {
//		multiplication(3,4);
//		addition(2,1);
//		subtraction(5,6);
		division(5,10);
//		division2(8,7);
	}
	
	public static int multiplication(int int3, int int4) {
		int result2 = int3 * int4;
		System.out.println(result2);
		return result2;
	}
	
	public static int addition(int int3, int int4) {
		int result2 = int3 + int4;
		System.out.println(result2);
		return result2;
	}	
	
	public static int subtraction(int int3, int int4) {
		int result2 = int3 - int4;
		System.out.println(result2);
		return result2;
	}
	
	public static void division(double int3, double int4) {
		
		if(int3<int4) {
			double result2 = int3 / int4;
			System.out.println(result2);
		} else {
			System.out.println("Division cannot be performed");
		}
		
		
	}
	public static double division2(double int3, double int4) {
		double result2 = int3 / int4;
		System.out.println(result2);
		return result2;
	}
}
