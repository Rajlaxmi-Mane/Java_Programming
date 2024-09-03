package com.inheritance;
class Per{
	int age;
	Per(int age){
		this.age=age;
	}
}

class Emp extends Per{
	String name;
	Emp(int age, String name){
		super(age);
		this.name=name;
	}
}

public class SuperExa {
	public static void main(String[] args) {
		Emp e=new Emp(101,"maithili");
		System.out.println(e.age);
		System.out.println(e.name);
	}

}
