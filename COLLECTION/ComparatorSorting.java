package com.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Films {
	String name;
	int rating;
	double cost;
	double earning;
	
	public Films(String name, int rating, double cost, double earning) {
		this.name = name;
		this.rating = rating;
		this.cost = cost;
		this.earning = earning;
	}
	
	public String toString() {
		return "name:"+name+", rating:"+rating+", cost:"+cost+", earning:"+earning;
	}
}

public class ComparatorSorting {
	public static void main(String[] args) {
		Films f1 = new Films("Naruto",10,100000,6000000);
		Films f2 = new Films("AOT",8,500000,500000);
		Films f3 = new Films("MHA",7,250000,1200000);
		Films f4 = new Films("DEATH NOTE",9,210000,540000);
		
		List list = new ArrayList();
		list.add(f1);
		list.add(f2);
		list.add(f3);
		list.add(f4);
		
		for(Object obj : list) {
			Films film = (Films) obj;
			System.out.println(film);
		}
		
		System.out.println("\n ---------------Sorted by ratings ------------------- \n");
		Collections.sort(list, new SortFilmsByRating());
		for(Object obj : list) {
			Films film = (Films) obj;
			System.out.println(film);
		}
	}
}

class SortFilmsByRating implements Comparator<Films> {
	@Override
	public int compare(Films o1, Films o2) {
		return o1.rating-o2.rating;
	}
}

class SortFilmsByEarning implements Comparator<Films> {
	@Override
	public int compare(Films o1, Films o2) {
		return (int) (o1.earning - o2.earning);
	} 
}
