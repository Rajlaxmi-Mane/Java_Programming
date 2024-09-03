package com.exception;

public class Arith {
	public static void main(String[] args) {
		try {
			System.out.println(10/0);
		}catch(Exception e) {
			System.out.println("num cannot be divided by 0");
		}
		System.out.println("hii");
	}

}
