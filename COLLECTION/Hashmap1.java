package com.collection;

import java.util.HashMap;

public class Hashmap1 {
	public static void main(String[] args) {
		HashMap map = new HashMap();
		map.put(5, null);
		map.put(null, "four");
		map.put(null, "one");
		map.put("out", "out");
		map.put("diff", null);
		map.put("apple", "zero");
		map.put(2, "two");
		map.put(3, "three");
		
		System.out.println(map);
		System.out.println(map.get("apple"));
		System.out.println();
		
		System.out.println(map.containsKey("zero"));
		System.out.println(map.containsKey(5));
		System.out.println();
		
		System.out.println(map.containsValue(5));
		System.out.println(map.containsValue("out"));
		
		map.remove("out");
		System.out.println(map);
		System.out.println(map.size());
		System.out.println(map.isEmpty());
		System.out.println();
		
		map.clear();
		System.out.println(map.isEmpty());
		System.out.println(map);
	}

}
