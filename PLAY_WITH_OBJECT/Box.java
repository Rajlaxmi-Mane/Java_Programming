package com.playwithobj;

public class Box {
	int length=10;
	public static void main(String[] args) {
		Box b=new Box();
		System.out.println(b.length);
		disRef(b);
	}
	public static void disRef(Box b) {
		System.out.println(b.length);
	}

}
