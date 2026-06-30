package com.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.TreeSet;

public class Treeset1 {
	public static void main(String[] args) {
		TreeSet ts = new TreeSet();
		ts.add(99);
		ts.add(23);
		ts.add(54);
		ts.add(34);
//		ts.add("ab");  gives exception at the time of sorting - classcastexception
		ts.add(1);
//		ts.add(null);  nullpointer exception
		
//		ArrayList list = new ArrayList(ts); gives exception at the time of sorting - classcastexception
//		Collections.sort(list);
		System.out.println(ts);
	}

}
