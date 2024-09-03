package com.decision_m_stmt;
import java.util.*;

public class IfPRog {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		if(n>=6 && n<=11) {
			System.out.println("GOOD MORNING");
		}else if(n>=12 && n<=16) {
			System.out.println("GOOD AFTERNOON");
		}else if(n>=17 && n<=20) {
			System.out.println("GOOD EVENING");
		}else if(n>=21 && n<24 || n>=0 && n<=4)
		{
			System.out.println("GOOD NIGHT");
		}else
		{
			System.out.println("INVALID HOURS");
		}
	}

}
