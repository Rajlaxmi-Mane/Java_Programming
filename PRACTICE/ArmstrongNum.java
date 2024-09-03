package com.practice;
import java.util.*;

public class ArmstrongNum {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int num,sum=0,temp=0;
		System.out.println("enter a number :");
		num=s.nextInt();
		temp=num;
		while(num!=0) {
			int rem=num%10;
			sum=sum+rem*rem*rem;
			num/=10;
		}
		if(temp==sum) {
			System.out.println("it is a armstrong number");
		}
		else {
			System.out.println("it is not a armstrong number.");
		}
	}

}
