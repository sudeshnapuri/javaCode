package com.qa.qacommunity;

public class Runner {

	
	public static void main(String[] args) {
		
//		Person bob = new Person("Bob", 190, 10, "Doctor", 37);
//		Person jill = new Person("Jill", 160, 4, "Civil Engineer", 34);
//		Person amy = new Person("Amy", 150, 5, "Shopkeeper", 27);
//		Person richard = new Person("Richard", 180, 9, "Actor", 25);
//	
//		
//		jill.greet();
//		richard.greet();
//		amy.height();
//		bob.height();
		
		
		BankAccount bank = new BankAccount(12345678, 112233, "Bob");
		BankAccount bank2 = new BankAccount(856385937, 445577, "Jill");
		BankAccount bank3 = new BankAccount(65836636, 998866, "Amy");
		
		System.out.println(bank.getAccountNumber());
		System.out.println(bank.getSortCode());
		System.out.println(bank.getAccountHolder());
		
		bank.setAccountNumber(98765432);
		
		System.out.println(bank.getAccountNumber());
		
	}
}
