package com.inheritance;

class ParentClass {
	static int a = 10;
	static int b = 20;

	public static void test() {
		System.out.println("i am from parent class");
	}

}
// CHILD CLASS

class ChildClass extends ParentClass {
	static int c = 30;
	static int d = 40;

	public static void test1() {
		System.out.println("i am from child class");
	}

}

//EXECUTABLE CLASS

public class Driver {
	public static void main(String[] args) {
		
		//accessing static members with the help of child class
		System.out.println(ChildClass.a);
		System.out.println(ChildClass.b);
		System.out.println(ChildClass.c);
		System.out.println(ChildClass.d);
		ChildClass.test();
		ChildClass.test1();

		// accessing with the help of parent class
		System.out.println(ParentClass.a);
		System.out.println(ParentClass.b);
		
		//child class members cannot be accessed by the parent class
		//System.out.println(ParentClass.c);
		//System.out.println(ParentClass.d);
	}

}
