package com.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// COMPARABLE EXAMPLE

class Employee implements Comparable{
	String name;
	int id;
	double sal;
	static String company = "Oracle";
	
	public Employee(int id, String name, double sal) {
		this.id = id;
		this.name = name;
		this.sal = sal;
	}
	
	public String toString() {
		return "id : "+id+", name : "+name+", sal : "+sal;
	}

	@Override
	public int compareTo(Object o) {
		Employee emp = (Employee) o;
		if(emp.sal > this.sal) {
			return -1;
		}
		return 1;
	}
}

public class ComparableSorting {
	public static void main(String[] args) {
		Employee emp = new Employee(101, "Maithili", 35000.00);
		Employee emp1 = new Employee(102, "Pooja", 40000.00);
		Employee emp2 = new Employee(103, "Madhav", 30000.00);
		Employee emp3 = new Employee(104, "Shreya", 25000.00);
		
		List list = new ArrayList();
		list.add(emp);
		list.add(emp1);
		list.add(emp2);
		list.add(emp3);
		
		for(Object obj : list) {
			System.out.println(obj);
		}
		
		System.out.println("\n ------------------- SORTED ON BASIS OF SALARY -----------------------\n");
		Collections.sort(list);
		for(Object obj : list) {
			System.out.println(obj);
		}
	}

}
