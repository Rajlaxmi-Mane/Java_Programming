package com.practice;

import java.util.*;
class SumOfFact 
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		int sum=0;
		System.out.println("enter any number ");
		int num=s.nextInt();
		System.out.println("Factors are : ");
		for (int i=1;i<=num ;i++ )
		{
			if (num%i==0)
			{
				sum=sum+i;
				System.out.print(i+" ");
			}
		}
		System.out.println();
		System.out.println("sum is "+sum);
	}
}
