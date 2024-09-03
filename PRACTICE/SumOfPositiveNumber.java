package com.practice;

import java.util.*;
class SumOfPositiveNumber 
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("enter size");
		int size=s.nextInt();
		int [] arr=new int[size];
		for (int i=0;i<arr.length ;i++ )
		{
			arr[i]=s.nextInt();
		}
		System.out.println("sum of Positive number ="+sum(arr));
	}
	public static int sum(int[] a){
		int sum=0;
		for (int i=0;i<a.length ;i++ )
		{
			if(a[i]>=0){
				sum=sum+a[i];
			}
		}
		return sum;
	}
}
