package com.practice;
import java.util.*;

public class Palindrome {
	public static void main(String[] args) {
		int num,sum=0,temp=0;
		Scanner s= new Scanner(System.in);
		System.out.println("enter a number : ");
		num=s.nextInt();
		temp=num;
		while(num!=0) {
			int rem=num%10;
			sum=sum*10+rem;
			num/=10;
		}
		if(temp==sum) {
			System.out.println("it is a palindrome number");
		}
		else {
			System.out.println("it is not a palindrome number");
		}
		
	}

}
