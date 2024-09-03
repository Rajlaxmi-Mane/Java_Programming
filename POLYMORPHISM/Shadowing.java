package com.polymorphism;
class Test{
	public static void test() {
		System.out.println("test method from test");
	}
}
class Demo extends Test{
	public static void test() {
		System.out.println("test method from demo");
	}
}

public class Shadowing {
	public static void main(String[] args) {
		Test t=new Demo();
		t.test();
		Demo d=new Demo();
		d.test();	
		
		
	}

}
