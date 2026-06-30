package com.collection;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListCRUD {
	public static void main(String[] args) {
		List list = new ArrayList(5);
		list.add("apple");
		list.add("banana");
		System.out.println(list);
		
		List list2 = new ArrayList(list);
		System.out.println(list2);
		
		Iterator li = list.iterator();
		while(li.hasNext()) {
			System.out.println(li.next());
		}
		
		System.out.println();
		for(int i=0; i<list.size();i++) {
			System.out.println(list.get(i));;
		}
		
		list2.add("orange");
		list2.add("strawberry");
		System.out.println(list2);
		list2.add(2,"kiwi");
		System.out.println(list2);
		
		System.out.println(list2.get(list2.size()-1));
		System.out.println(list2.get(0));
		
		System.out.println(list2.indexOf("kiwi"));
		
		for(Object obj : list2) {
			System.out.println(obj);
		}
	}

}
