package com.practice;
import java.util.*;

public class SumOfDIgit {
	public static void main(String[] args) {
		int num,sum=0;
		Scanner s=new Scanner(System.in);
		System.out.println("enter a number");
		num=s.nextInt();
		while(num!=0) {
			int rem=num%10;
			sum=sum+rem;
			num=num/10;
		}
		System.out.println("sum of digit is : "+sum);
	}

}
