package com.practice;

import java.util.*;
class Factors  {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter a number");
		int num=s.nextInt();
		System.out.println("factors of a number are : ");
		for (int i=1;i<=num ;i++ )
		{
			if( num%i==0)
			{
				System.out.println(i);
			}
		}
	}
}
