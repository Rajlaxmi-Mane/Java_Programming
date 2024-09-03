package com.inheritance;

class A {
	static int age = 21;
	public static void test() {
		System.out.println("@method of Parent class:");
	}
}

public class Demo extends A {
	static int id = 202;
	public static void demo() {
		System.out.println("@method from child class");
	}

	public static void main(String[] args) {
		System.out.println("i am form child class "+id);
		System.out.println(" I am from parent class :"+age);
		test();
		demo();
	}

}
