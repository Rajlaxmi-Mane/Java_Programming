package com.relationship;
import java.util.*;
class Employee{
	int id;
	String name;
	double sal;
	Employee(int id,String name, double sal){
		this.id=id;
		this.name=name;
		this.sal=sal;
	}
}
class Company{
	String name;
	String city;
	int nofemp;
	Company(String name, String city, int nofemp){
		this.name=name;
		this.city=city;
		this.nofemp=nofemp;
	}
	Employee e=new Employee(123,"MAITHILI",90000);
		
}

public class CompanyDriver {
	public static void main(String[] args) {
		Company c=new Company("GOOGLE","MUMBAI",50000);
		System.out.println("company name= "+c.name);
		System.out.println("company city = "+c.city);
		System.out.println("no of emp = "+c.nofemp);
		System.out.println("employee id = "+c.e.id);
		System.out.println("name of employee = "+ c.e.name);
		System.out.println("salary of employee = "+c.e.sal);
	}

}
