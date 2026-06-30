package com.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class Hashset1 {
	public static void main(String[] args) {
		Set set = new HashSet();
		set.add("sonu");
		set.add("monu");
		set.add("tonu");
		set.add("sonu");
//		set.add(null);  get exception at the time of sorting null pointer exception
		set.add("sonu");
		
		ArrayList list = new ArrayList(set);
		Collections.sort(list);
		System.out.println(list);
		
		set.add("ram");
		set.add("sham");
		
		System.out.println(set.size());
		set.removeAll(list);
		System.out.println(set);
	}

}
