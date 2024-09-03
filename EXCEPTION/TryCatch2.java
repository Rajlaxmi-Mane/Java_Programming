package com.exception;

public class TryCatch2 {
	public static void main(String[] args)throws Exception {
		add();
		System.out.println("hii");
	}
	public static void add()throws Exception {
		throw new ClassNotFoundException();
	}

}
