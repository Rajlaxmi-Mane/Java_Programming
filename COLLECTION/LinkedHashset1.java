package com.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class LinkedHashset1 {
	public static void main(String[] args) {
		Set<Cricketers> set = new LinkedHashSet<>();
		set.add(new Cricketers("Virat Kohli",15,8,9087));
		set.add(new Cricketers("MSD",25,5,11507));
		set.add(new Cricketers("Rohit Sharma",12,10,8765));
		set.add(new Cricketers("UV",13,7,9999));
		set.add(new Cricketers("Shikhar",9,11,8998));
		
		List<Cricketers> list = new ArrayList<>(set);
		System.out.println(set);
		
		Collections.sort(list, new SortByRun());
		System.out.println("\n---- sort by run -----------");
		for(Cricketers ch : list) {
			System.out.println(ch);
		}
		
		Collections.sort(list, new SortByWin());
		System.out.println("\n---- sort by win -----------");
		for(Cricketers ch : list) {
			System.out.println(ch);
		}
		Collections.sort(list, new SortByName());
		System.out.println("\n---- sort by Name -----------");
		for(Cricketers ch : list) {
			System.out.println(ch);
		}
	}

}

class Cricketers {
	String name;
	int win;
	int lost;
	int run;

	Cricketers(String name, int win, int lost, int run) {
		this.name = name;
		this.win = win;
		this.lost = lost;
		this.run = run;
	}
	
	public String toString() {
		return "name:"+name+"  win:"+win+"  lost:"+lost+"  run:"+run;
	}
}

class SortByRun implements Comparator<Cricketers>{
	public int compare(Cricketers c1, Cricketers c2) {
		return c2.run-c1.run;
	}
}

class SortByWin implements Comparator<Cricketers>{
	public int compare(Cricketers c1, Cricketers c2) {
		return c1.win-c2.win;
	}
}

class SortByName implements Comparator<Cricketers>{
	public int compare(Cricketers c1, Cricketers c2) {
		return c1.name.compareTo(c2.name);
	}
}
