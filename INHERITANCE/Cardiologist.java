package com.inheritance;

class Doctor{
	String name="ARJUN";
	int id=645;
	
	public void checkBp() {
		System.out.println("checking bp");
	}
	public void checkPulse() {
		System.out.println("checking pulse");
	}
	
}
public class Cardiologist extends Doctor {
	public static void main(String[] args) {
		Cardiologist c=new Cardiologist();
		System.out.println(c.name);
		System.out.println(c.id);
		c.checkBp();
		c.checkPulse();
		c.byPass();
		
		
		}
	public void byPass() {
		System.out.println("surgery in progress ");
	}

}
