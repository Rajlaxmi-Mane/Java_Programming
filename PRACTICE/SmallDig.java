package com.practice;

import java.util.*;
class SmallDig 
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		int smalldig;
		System.out.println("enter a number");
		int num=s.nextInt();
        smalldig=9;
		while(num!=0)  
		{
			int rem=num%10;
			if(rem<smalldig){
				smalldig=rem;
			}
			num/=10;
		}
		System.out.println("smalles digit "+smalldig);
	}
}

