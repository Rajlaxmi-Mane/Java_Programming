package com.practice;

import java.util.*;
class Factorial 
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		int num;
		System.out.println("enter number ");
		num=s.nextInt();
		int fact=1;
		for (int i=1;i<=num ;i++ )
		{
			fact=fact*i;
		}
		System.out.println("Factorial is = "+fact);
	}
}
