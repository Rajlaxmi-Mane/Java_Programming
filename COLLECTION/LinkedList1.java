package com.collection;

import java.util.Collections;
import java.util.LinkedList;

public class LinkedList1 {
	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		list.add(45);
		list.add(32);
		list.add(89);
		list.add(34);
		
		Collections.sort(list);
		System.out.println(list);
		Collections.reverse(list);
		System.out.println(list);
		
		for(Object obj : list) {
			Integer num = (Integer) obj;
			System.out.println(num);
		}
		
		System.out.println();
		System.out.println(list.size());
		System.out.println(list.get(2));
		System.out.println(list.indexOf(45));
	}

}
