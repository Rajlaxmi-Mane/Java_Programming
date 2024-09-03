package com.practice;
import java.util.*;
public class Prime {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter a number");
		int num=s.nextInt();
		int t=0;
		for (int i=2;i<num;i++) {
			if  (num%i==0) {
				t=1;
				break;
			}
			
		}
		if(t==1) {
			System.out.println("no is not a prime no");
		}
		else {
			System.out.println("no is a prime no");
		}
		
	}

}
