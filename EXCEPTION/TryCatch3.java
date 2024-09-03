package com.exception;

public class TryCatch3 {
	public static void main(String[] args)throws Exception {
		add();
	}
	public static void add()throws Exception {
		for(int i=0;i<5;i++) {
			Thread.sleep(1000);
			System.out.println("*");

		}
	}

}
