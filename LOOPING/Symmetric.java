package com.looping;

import java.util.*;

public class Symmetric {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();
		int length = length(num);
		if (length % 2 == 0) {
			int n2=findn2(num,length);
			int n1=findn1(num,length);
			int sum=n1+n2;
			int sq=sum*sum;
			if(sq==num) {
				System.out.println("yest symmetric");
				System.out.println(sq);
			}

		} else {
			System.out.println("invalid num");
		}

	}
	//find n1
	private static int findn1(int num,int length) {
		for(int i=0;i<length/2;i++) {
			num/=10;
		}
		return num;
	}

	// FIND N2

	private static int findn2(int num, int length) {
           int n2=0;
           for(int i=1;i<=length/2;i++) {
        	   int d=num%10;
        	   n2=n2*10+d;
        	   num/=10;
           }
         
           return reverse(n2);
	}
	
	// to reverse n2
	public static int reverse(int num) {
		int rev=0;
	  while(num!=0) {
		  int rem=num%10;
		  rev=rev*10+rem;
		  num/=10;
		  
	  }
	  return rev;
	}

	// METHOD TO RETURN LENGTH OF NUM
	public static int length(int num) {
		int cnt = 0;
		while (num != 0) {
			num /= 10;
			cnt++;
		}
		return cnt;
	}
}