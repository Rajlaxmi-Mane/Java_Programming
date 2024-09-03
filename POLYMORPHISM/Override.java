package com.polymorphism;
class Parent{
	public void add() {
		System.out.println(10+20);
	}
}
class Child extends Parent{
	public void add() {
		System.out.println("Overides");
	}
}

public class Override {
	public static void main(String[] args) {
		Parent p=new Child();
		p.add();
		
		Child c=new Child();
		c.add();
	}

}
