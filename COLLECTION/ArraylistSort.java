package com.collection;
import java.util.ArrayList;
import java.util.Collections;

public class ArraylistSort {
	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		al.add(10);
		al.add(79);
		al.add(43);
		al.add(34);
		al.set(2, 30);
		System.out.println(al.get(2));
		System.out.println(al);
		Collections.sort(al);
		
		for(Object o:al) {
			Integer i=(Integer)o;
			if(i%2==0) {
				System.out.println(o);	
			}
			
			
		}
	}

}
