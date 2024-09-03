package com.collection;
import java.util.TreeSet;
import java.util.Comparator;
public class TreeSetSort {
	public static void main(String[] args) {
		TreeSet <Emp1> t=new TreeSet(new SortByIdAsc());
		t.add(new Emp1(106,"maithili",5000));
		t.add(new Emp1(103,"pooja",1000));
		t.add(new Emp1(101,"madhav",7000));
		t.add(new Emp1(105,"dhaiyyu",3000));
		t.add(new Emp1(104,"mahi",4000));
		
		for(Emp1 e:t) {
			System.out.println(e);
		}
	}
}
class Emp1{
	int id;
	String name;
	double sal;
	public Emp1(int id, String name, double sal) {
		super();
		this.id = id;
		this.name = name;
		this.sal = sal;
	}
	@Override
	public String toString() {
		return "[id=" + id + ", name=" + name + ", sal=" + sal + "]";
	}
	
}

class SortByIdAsc implements Comparator<Emp1>{

	@Override
	public int compare(Emp1 o1, Emp1 o2) {
		// TODO Auto-generated method stub
		return o1.id-o2.id;
	}

	
}
class SortByIdDesc implements Comparator<Emp1>{

	@Override
	public int compare(Emp1 o1, Emp1 o2) {
		// TODO Auto-generated method stub
		return o2.id-o1.id;
	}

	
}
class SortByNameAsc implements Comparator<Emp1>{

	@Override
	public int compare(Emp1 o1, Emp1 o2) {
		// TODO Auto-generated method stub
		return o1.name.compareTo(o2.name);
	}

	
}
class SortByNameDesc implements Comparator<Emp1>{

	@Override
	public int compare(Emp1 o1, Emp1 o2) {
		// TODO Auto-generated method stub
		return o2.name.compareTo(o1.name);
	}

	
}
