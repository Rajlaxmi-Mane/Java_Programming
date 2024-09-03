package com.inheritance;

class Person{
	int age;
	String name;
	public void walk() {
		System.out.println(name+" is walking");
	}
	public void eat() {
		System.out.println(name+" is eating");
	}
	public Person(int age, String name) {
		this.age = age;
		this.name = name;
	}
	
}
class Stud extends Person {
	String clg;
	double per;
	
	public Stud(String clg, double per,int age, String name) {
		super(age,name);
		this.clg = clg;
		this.per = per;
	}
	public void study() {
		System.out.println(name+" is studying");
	}
	public void attend() {
		System.out.println(name +" is attending classes");
	}
	public void display() {
		System.out.println(clg);
		System.out.println(name);
		System.out.println(age);
		System.out.println(per);
		walk();
		eat();
		study();
		attend();
	}

}
public class Student{
	public static void main(String[] args) {
		Stud s=new Stud("STBCET",89.83,21,"MAITHILI");
		s.display();
	}
}