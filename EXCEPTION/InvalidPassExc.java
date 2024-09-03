package com.exception;

class InvalidPassException extends RuntimeException{
	String s;
	InvalidPassException(String s){
		this.s=s;
	}
	public String getMessage() {
		return s;
	}
	
}
class InvalidId extends Exception{
	String s;
	InvalidId(String s){
		this.s=s;
	}
	public String getMessage() {
		return s;
	}
}
public class InvalidPassExc {
	public static void main(String[] args) throws Exception {
		int pas=123;
		String un="aa";
		if(un=="aa") {
			if(pas==1283) {
				System.out.println("login successfull");
			}
			else {
				throw new InvalidPassException("Password Not Match");
			}
		}else {
			throw new InvalidId("Invalid Username");
		}
		System.out.println("ENJOY THE APPLICATION ");
	}

}
