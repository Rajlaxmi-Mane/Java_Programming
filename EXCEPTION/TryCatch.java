package com.exception;

public class TryCatch {
	public static void main(String[] args) throws Exception{
		add();
		System.out.println("hiiii");
		
	}
	public static void add() throws Exception{
		try {
			System.out.println(10/0);
		}catch(Exception e) {
			throw new ClassNotFoundException();
			
		}
		System.out.println("heloo");
	}

}
