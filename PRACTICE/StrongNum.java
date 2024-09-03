
package com.practice;
import java.util.*;

public class StrongNum {
	public static void main(String[] args) {
		int sum,fact;
		/*Scanner s=new Scanner(System.in);
		System.out.println("enter a number :");
		num=s.nextInt();*/
		for(int num=1;num<=100000;num++) {
		 int temp=num;
		 sum=0;
		while(temp!=0) {   
			fact=1;
			int rem=temp%10;
			for(int i=1;i<=rem;i++) {
				fact=fact*i;
			}
			sum=sum+fact;
			temp/=10;
			
		}
		if(num==sum) {
			System.out.println(num+" is a strong number");
		}
		/*else {
			System.out.println(num+" is a weak number");
		}*/
		}
	}
	}


