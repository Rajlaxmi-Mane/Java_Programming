package com.decision_m_stmt;

import java.util.*;

public class EcoomerceDiscnt {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int age = s.nextInt();
		double dis = 0;
		double price = s.nextDouble();
		double tprice = price;
		if (age >= 13 && age <= 19) {
			price = price - (price*0.05);
			dis = tprice - price;
			if (price >= 5000) {
				price = price - (price*0.05);
				dis = tprice - price;
			}
		} else if (age > 19 && age <= 29) {
			price = price - (price*0.06);
			dis = tprice - price;
			if (price >= 4000) {
				price = price - (price*0.06);
				dis = tprice - price;
			}
		} else if (age > 29) {
			price = price - (price*0.15);
			dis = tprice - price;
		}
		System.out.println("TOTAL PRICE IS : "+tprice);
		System.out.println("PRICE AFTER DISCOUNT IS : "+price);
		System.out.println("DISCOUNT IS : "+dis);
	}

}
