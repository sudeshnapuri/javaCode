package com.qa.qacommunity;

public class Results {
	public static double physics;
	public static double chemistry;
	public static double biology;
	public static double total;
	public static double totalpercentage;
	
	public static void main(String[] args) {
		method1(20, 50, 70);
		method2();
		method3();
	}
	
	public static void method1(double physicsGrade, double chemistryGrade, double biologyGrade) {
		physics = physicsGrade;
		chemistry = chemistryGrade;
		biology = biologyGrade;
		total = physics+chemistry+biology;
		System.out.println("Your physics grade is "+physics);
		System.out.println("Your chemistry grade is "+chemistry);
		System.out.println("Your biology grade is "+biology);
		System.out.println("Your total grade is "+total);
	}
	
	public static void method2() {
		totalpercentage = total*100/450;
		System.out.println("Your total percentage is "+totalpercentage+"%");
	}
	
	public static void method3() {
		if(totalpercentage>=60) {
			System.out.println("You have passed the exam");
		} else {
			System.out.println("You have failed the exam");
		}
	}
	
}
