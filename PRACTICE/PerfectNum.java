package com.practice;
import java.util.*;

public class PerfectNum {
	public static void main(String[] args) {
		int num,sum=0,temp;
		Scanner s=new Scanner(System.in);
		System.out.println("enter a number");
		num=s.nextInt();
		temp=num;
		for(int i=1;i<num;i++) {
			if(num%i==0) {
				System.out.println(i);
				sum=sum+i;
				
			}
		}
		System.out.println("sum is :"+sum);
		if(temp==sum) {
			System.out.println(temp+" is a perfect number");
		}
		else {
			System.out.println(temp+" is not a perfect number");
		}
	}

}
