package com.collection;
import java.util.TreeSet;

public class Unique {
	public static void main(String[] args) {
		int [] arr1= {10,20,30,40,50};
		int [] arr2= {30,40,50,60,70};
		TreeSet h=new TreeSet();
		for(int i=0;i<arr1.length;i++) {
			h.add(arr1[i]);
			h.add(arr2[i]);
		}
		System.out.println(h);
		
	}

}
