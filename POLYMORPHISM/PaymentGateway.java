package com.polymorphism;

//   ------------------ METHOD OVERRIDING -------------------------

class Payment {
	static double balance = 2000;
	public void updateBalance(double balance) {
		System.out.println("Payment processing...");
	}

}

class UPI extends Payment{
	public void updateBalance(double balance) 	{
		if(this.balance < balance) {
			System.out.println("-------- Insufficient balance -------------");
		} else {
			this.balance = this.balance + balance ;
			System.out.println("Transaction successfull");
		}
		System.out.println("available balance : "+ this.balance);
	}
}

class CreditCard extends Payment{
	public void updateBalance(double balance) 	{
		if(this.balance < balance) {
			System.out.println("-------- Insufficient balance -------------");
		} else {
			this.balance = this.balance + balance ;
			System.out.println("Transaction successfull");
		}
		System.out.println("available balance : "+ this.balance);
	}
}

public class PaymentGateway{
	public static void main(String[] args) {
		Payment payment = new UPI();
		payment.updateBalance(200);
		
		Payment payment1 = new CreditCard();
		payment1.updateBalance(-400);
	}
}