package com.qa.qacommunity;

public class BankAccount {

	private long accountNumber;
	private long sortCode;
	private String accountHolder;
	
//	GETTERS
	public long getAccountNumber() {
		return this.accountNumber;
	}
	
	public long getSortCode() {
		return sortCode;
	}

	public String getAccountHolder() {
		return accountHolder;
	}

//	SETTERS
	public void setAccountHolder(String accountHolder) {
		this.accountHolder = accountHolder;
	}
	
	public void setAccountNumber(long accountNumber) {
		this.accountNumber = accountNumber;
	}
	
		public void setSortCode(long sortCode) {
		this.sortCode = sortCode;
	}
		
//	CONSTRUCTORS
	public BankAccount(long accountNumber, long sortCode, String accountHolder) {
		super();
		this.accountNumber = accountNumber;
		this.sortCode = sortCode;
		this.accountHolder = accountHolder;
	}

//	METHODS
//	NON STATIC
	
	public void sortCode() {
		System.out.println("Hello, my sort code is " + sortCode);
	}
	
//	STATIC
	public static void hello() {
		System.out.println("Hello");
	}
}
