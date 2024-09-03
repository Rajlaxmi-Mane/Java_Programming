package com.relationship;
class Acc{
	int no;
	String holder;
    Acc(int no,String holder){
    	this.no=no;
    	this.holder=holder;
    }
}

class Bank{
	String name;
	int noofbranch;
	String cnt;
	Bank(String name,int noofbranch,String cnt){
		this.name=name;
		this.noofbranch=noofbranch;
		this.cnt=cnt;
		
	}
	Acc a=new Acc(123,"MAITHILI");
}
public class BankDriver {
	public static void main(String[] args) {
		Bank b=new Bank("SBI",32,"INDIA");
		System.out.println("BANK ="+b.name);
		System.out.println("no of branches= "+b.noofbranch);
		System.out.println("country ="+b.cnt);
		System.out.println("Acc ID="+b.a.no);
		System.out.println("holder name ="+b.a.holder);
	}

}
