package com.encapsulation;

class BankAccountDetails {
	private long accountNumber;
	private String accountHolder;
	private float balance;
	
	BankAccountDetails(long accountNumber, String accountHolder) {
		this.accountNumber = accountNumber;
		this.accountHolder = accountHolder;
	}
	
	public void accountInfo() {
		System.out.println("AccountNumber : " + accountNumber);
		System.out.println("AccountHolder : " + accountHolder);
	}

	public float getBalance() {
		return balance;
	}

	public void updateBalance(double d) {
		this.balance = (float) (this.balance + d);
	}

}

public class BankAccount {
	public static void main(String[] args) {
		BankAccountDetails acc = new BankAccountDetails(1007575, "Amit shah");
		acc.updateBalance(1000);
		acc.accountInfo();
		System.out.println(acc.getBalance());
		acc.updateBalance(-155.50);
		System.out.println(acc.getBalance());
	}
}