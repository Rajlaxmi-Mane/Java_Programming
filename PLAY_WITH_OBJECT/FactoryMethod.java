package com.playwithobj;
import java.util.*;

public class FactoryMethod {
	int id;
	String name;
	double sal;
	char div;
	FactoryMethod(int id, String name,double sal,char div){
		this.id=id;
		this.name=name;
		this.sal=sal;
		this.div=div;
	}
	public static void main(String [] args) {
		FactoryMethod fk=fackMeth(101,"maithili",80000,'a');
		System.out.println("ID :"+fk.id);
		System.out.println("NAME :"+fk.name);
		System.out.println("SAL: "+fk.sal);
	    System.out.println("DIV :"+fk.div);
	}
	public static FactoryMethod fackMeth(int i,String n,double d,char c) {
		return new FactoryMethod(i,n,d,c);
	}
}
