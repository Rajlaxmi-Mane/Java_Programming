package com.practice;

public class ReturnClass {
	int a=10,b=20;
	public static void main(String[] args) {
		ReturnClass rs=returnClass();
		int sum=rs.a+rs.b;
		System.out.println(sum);
	}
	 
	public static ReturnClass returnClass() {
		ReturnClass rs=new ReturnClass();
		return rs;
	}

}
