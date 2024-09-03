package com.ObjectClass;
class Exa{
	String name;
	int sal;

	public Exa(String name,int sal) {
		super();
		this.name = name;
		this.sal=sal;
	}
	public int hashCode(){
		return sal;
	}
	
}

public class hashCode {
public static void main(String[] args) {
	Exa e=new Exa("MM",45000);
	System.out.println(e.hashCode());
}
}
