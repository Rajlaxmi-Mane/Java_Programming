package com.collection;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
class Empl{
	String name;
	int id;
	double fee;
	public Empl(String name, int id, double fee) {
		super();
		this.name = name;
		this.id = id;
		this.fee = fee;
	}
	public String toString() {
		return name+" "+id+" "+fee;
	}
	
}
public class Hashmap {
	public static void main(String[] args) {
		HashMap hm=new HashMap();
		Empl e=new Empl("maithili",101,10200);
		hm.put(e.name,e);
		
		Empl e1=new Empl("siya",404,56098);
		hm.put(e1.name,e1);
		
		Empl e2=new Empl("kiya",302,10000);
		hm.put(e2.name,e2);
		
		Empl e3=new Empl("riya",201,12000);
		hm.put(e3.name,e3);

		
     	Set hs=hm.keySet();
		System.out.println(hs);
		List al=new ArrayList(hs);
		Collections.sort(al);
		System.out.println(al);

	}

}

class sortById implements Comparator<Empl>{
	public int compare(Empl e1, Empl e2) {
		return e1.name.compareTo(e2.name);
	}

}