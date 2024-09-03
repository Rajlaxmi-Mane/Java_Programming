package com.inheritance;

class Parent{
	static int age=40;
	int a=10;
	public void test() {
		System.out.println("@NSM form Parent CLass ");
	}
}


class Child extends Parent {
	static int d=50;
	int b=20;
	public void test1() {
		System.out.println("@NSM form Child class");
	}	
}


//EXECUTABLE CLASS
public class InheritNonStaticMem {
	public static void main(String[] args) {
		Child c=new Child();
		System.out.println(c.a);
		c.test();
		System.out.println(c.b);
		c.test1();
		
		System.out.println();
		Parent p=new Parent();
		System.out.println(p.a);
		p.test();
		
		//cannot access child class members with the help of parent class object
		// System.out.println(p.b);
		// p.test1();
		System.out.println();
		System.out.println("FOR STATICS");
		System.out.println(c.age);
		System.out.println(c.d);
		
			
	}

}
