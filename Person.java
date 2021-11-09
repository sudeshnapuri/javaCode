package com.qa.qacommunity;

public class Person {

	private int shoesize;
	private String jobtitle;
	private int age;
	private String name;
	private double height;
	
	public Person(String name, double height, int shoesize, String jobtitle, int age) {
		this.name = name;
		this.height = height;
		this.shoesize = shoesize;
		this.jobtitle = jobtitle;
		this.age = age;
		
	}
	
	public Person(double height, String name) {
		this.height = height;
		this.name = name;
		
	}
	
	public void greet() {
	System.out.println("Hello, I'm " + name + " and I'm " + age + " years old. I work as a " + jobtitle + ". I'm " + height + " cm tall.");
	}
	
	public void height() {
	System.out.println("Hello, I'm " + name + " and I'm " + height + " cm tall.");
	}
	
	
}
