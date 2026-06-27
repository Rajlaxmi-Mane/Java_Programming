package com.encapsulation;

import java.util.Scanner;

class ATMPrint {
	private int pin;
	private double balance;
	
	public void setPin(int pin) {
		this.pin = pin;
	}
	
	public int getPin() {
		return pin;
	}

	public double getBalance() {
		return balance;
	}
	
	public void setBalance(double balance) {
		this.balance = balance;
	}

	public void withdraw(double amount) {
		if(amount  > balance) {
			System.out.println("---- INSUFFICIENT BALANCE ----");
			System.out.println("Current balance " + this.balance );
		} else {
			balance = balance - amount;
			System.out.println("---- Withdraw successfull ----");
			System.out.println("Remaining balance " + balance);
		}
	}
	
	public boolean checkPin(int pin) {
		if(this.pin == pin) {
			return true;
		} else {
			return false;
		}
	}
}

public class ATMSystem {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		ATMPrint atm = new ATMPrint();
		atm.setPin(2404);
		atm.setBalance(2000);
		

		System.out.println("enter pin");
		int pin = sc.nextInt();
		
		if(atm.checkPin(pin)) {
			System.out.println("enter amount");
			int amt = sc.nextInt();
			atm.withdraw(amt);
		} else {
			System.out.println("-------- Incorrect Pin --------");
		}
	}
       
}
