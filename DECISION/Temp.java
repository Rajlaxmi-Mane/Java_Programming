package com.decision_m_stmt;
import java.util.*;

public class Temp {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int mintemp=70;
		int maxtemp=80;
		int ctemp=s.nextInt();
		float farentemp=ctemp*(9.0f/5)+32;
		System.out.println(farentemp);
		if(farentemp>=mintemp && farentemp<=maxtemp) {
			System.out.print("TEMPERATURE IS IN RANGE");
		}
	}

}
