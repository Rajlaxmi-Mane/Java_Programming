package com.inheritance2;
class Gp{
	String name ;

	public Gp(String name) {
		super();
		this.name = name;
	}
	
}
class Father extends Gp {

	public Father(String name,String gpn) {
		super(gpn);
		this.name=name;
	}
	public void dis() {
		System.out.println("sons name = "+super.name);
	}
}

class Son extends Father {
	

	public Son(String name,String fn,String gpn) {
		super(fn,gpn);
		this.name=name;
	}

	public void display() {
		System.out.println("fathers name : " +super. name);
		System.out.println("son name : " + name);
		dis();

	
	}
}

public class Demo {
	public static void main(String[] args) {

		Son s = new Son("MADHAV","PRAMOD","SUDHAKAR");
		s.display();

	}
}
