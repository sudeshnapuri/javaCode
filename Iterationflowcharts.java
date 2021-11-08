package com.qa.qacommunity;

public class Iterationflowcharts {

	public static void main(String[] args) {
//		flowcharts1();
//		flowcharts2();
//		flowcharts3();
//		flowcharts5();
		coins(4.58, 20);
	}
	
	public static void flowcharts1() {
	for(int A = 100; A <= 200; A++) {
		System.out.println("A");
		}
	
	}
	
	public static void flowcharts2() {
	for(int A  = 100; A <= 200; A++) {
		if (A % 2 ==0) {
			System.out.println("-");
		}
		else {
			System.out.println("*");
			}
		}
	}
	
	public static void flowcharts3() {
	for(int A  = 1; A <= 10; A++) {
		for (int B = 1; B <=10; B++) {
			System.out.println(B);
			}
		}
	}
	
	public static void flowcharts5() {
		for(int A  = 1; A <= 10; A++) {
			for (int B = 1; B <=A; B++) {
				System.out.println(A);
			}
		}
	}
	
	public static void coins(double cost, double amount) {
		int amount20note = 0;
		int amount10note = 0;
		int amount5note = 0;
		int amount1coin = 0;
		int amount2coin = 0;
		int amount50p = 0;
		int amount20p = 0;
		int amount10p = 0;
		int amount5p = 0;
		int amount2p = 0;
		int amount1p = 0;
		
		double change = amount-cost;
		System.out.println("Change expected: £" + change);
		
		if(change >=0.009) {
			while (change >=20) {
				change -= 20;
				amount20note++;
			} if (amount20note > 0) {
				System.out.println(amount20note + "Twenty Pounds");
			}
				
			} while (change >= 10) {
			change -= 10;
				amount10note++;
			} if (amount10note > 0) {
				System.out.println(amount10note + "Ten Pounds");
			}
			
			while (change >= 5) {
				change -= 5;
				amount5note++;
			} if (amount5note > 0) {
				System.out.println(amount5note + "Five Pounds");
			}
			
			while (change >= 1) {
				change -= 1;
				amount1coin++;
			} if (amount1coin > 0) {
				System.out.println(amount1coin + "One Pounds");
			}
			
			while (change >= 2) {
				change -= 2;
				amount2coin++;
			} if (amount2coin > 0) {
				System.out.println(amount2coin + "Two Pounds");
			}
			} 
}
		

