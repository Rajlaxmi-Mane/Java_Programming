package com.ObjectClass;
class Demo1{
	//we can retrun+ any no of properties by just concatinating them
	String name;
	int id;
	public Demo1(String name, int id) {
		super();
		this.name = name;
		this.id = id;
	}
	public String toString() {
		return name;
	}
}
public class toString2 {
	public static void main(String[] args) {
		Demo1 d=new Demo1("Aradhya",66);
		Demo1 d1=new Demo1("Siya",65);
		System.out.println(d);
		System.out.println(d1);
	}

}
