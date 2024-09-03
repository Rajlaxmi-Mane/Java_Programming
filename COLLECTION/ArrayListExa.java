package com.collection;
import java.util.*;

public class ArrayListExa {

	public static void main(String[] args) {
		ArrayList e=new ArrayList();
		e.add(10);
		e.add(new Object());
		e.add("hii");
		e.add(29.98);
		e.add('A');
		 
		ArrayList e1=new ArrayList();
		e1.add(10);
		e1.add('A');
		
		System.out.println(e.size());
		System.out.println(e.get(1));
		System.out.println(e.indexOf(10));
		System.out.println(e.contains('A'));
		System.out.println(e.containsAll(e1));
		System.out.println(e.contains(76));
		System.out.println(e.isEmpty());
		e1.remove(1);
		e.removeAll(e1);
		System.out.println(e);
		
		for( Object o:e) {
			System.out.println(o);
		}
				
	}
}
