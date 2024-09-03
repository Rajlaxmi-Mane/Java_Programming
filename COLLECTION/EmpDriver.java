package com.collection;
import java.util.ArrayList;
import java.util.Collections;

class Emp implements Comparable{
	int id;
	String name;
	double sal;
	public Emp(int id, String name, double sal) {
		super();
		this.id = id;
		this.name = name;
		this.sal = sal;
	}
	@Override
	public String toString() {
		return "Emp [id=" + id + ", name=" + name + ", sal=" + sal + "]";
	}
	@Override
	public int compareTo(Object o) {
		Emp e=(Emp)o;
	
		return this.id-e.id;
	}

}
public class EmpDriver {
	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		al.add(new Emp(45,"mahi",5000));
		al.add(new Emp(54,"rahi",8000));
		al.add(new Emp(32,"ahi",600));
		Collections.sort(al);
		for(Object e:al) {
			System.out.println(e);
		}
	}

}
