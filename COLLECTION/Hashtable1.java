package com.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Set;
import java.util.TreeMap;

import com.Try.Collection;

public class Hashtable1 {
	public static void main(String[] args) {
		LinkedHashMap map = new LinkedHashMap();
		map.put("acc4", new Account("ram",18000.67));
		map.put("acc2", new Account("Monu",42000.67));
		map.put("acc1", new Account("laxman",50000.67));
		map.put("acc3", new Account("karn",1000.67));
		map.put("acc2", new Account("Monu2",12000.67));
		System.out.println(map.values());
		
//        System.out.println(map);
//        Set set = map.keySet();
//        System.out.println(set); // mentail insertion order
//      
//        for(Object obj : set) {
//        	System.out.println(obj + " = "+map.get(obj));
//        }
        
        TreeMap tree = new TreeMap(map); // sort on basis of keys
//        Set set = tree.keySet(); OR
        Set set = new HashSet(tree.values());
        
        for(Object obj : set) {
        	System.out.println(obj);
        }
        
//        System.out.println("\n--------------- sort by name ---------------\n");
//        ArrayList al = new ArrayList(map.values());
//        Collections.sort(al,new SortAccountByName());
//        for(Object obj : al) {
//        	System.out.println(obj);
//        }
        
        System.out.println("\n--------------- sort by balance ---------------\n");
        ArrayList al = new ArrayList(map.values());
        Collections.sort(al,new SortByBalance());
        for(Object obj : al) {
        	System.out.println(obj);
        }
	}
}

class Account {
	String name;
	double balance;

	public Account(String name, double balance) {
		this.name = name;
		this.balance = balance;
	}
	
	public String toString() {
		return "name:"+name+"  balance:"+balance;
	}
}

class SortAccountByName implements Comparator<Account>{
	public int compare(Account a1, Account a2) {
		return a1.name.compareTo(a2.name);
	}
}

class SortByBalance implements Comparator<Account>{
	public int compare(Account a1, Account a2) {
		return (int)(a1.balance-a2.balance);
	}
}