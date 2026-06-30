package com.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Generics {
	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<Integer>();
//		list.add("1");     checks for type safety at runtime
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		
		for(Integer obj:list) {
			if(obj % 2 == 0) {
				System.out.println(obj);
			}
		}
		
		
//		WAP to display name having length more than 4.
		
		List<String> str = new ArrayList<>();
		str.add("ram");
		str.add("sonu");
		str.add("maithili");
		str.add("aradhya");
		str.add("monu");
		
		for(String s : str) {
			if(s.length() > 4) {
				System.out.println(s);
			}
		}
		
		Collections.sort(str);
		System.out.println(str);
		Collections.reverse(str);
		System.out.println(str);
		
		
//		List list = new ArrayList();
//		list.add("1");
//		list.add("2");
//		list.add(3);
//		list.add(4);
//		list.add("5");
		
//		for(Object obj : list) {
//			Integer i = (Integer) obj;
//			if(i % 2 == 0) {
//				System.out.println(obj);
//			}
//		}
	}
}
