package com.practice;
import java.util.*;
public class CountOfEvenOdd {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int num,even=0,odd=0;
		System.out.println("enter anumber :");
		num=s.nextInt();
		while(num!=0) {
			int rem=num%10;
			if(rem%2==0) {
				even++;
			}
			else {
				odd++;
			}
			num/=10;
		}
		System.out.println("even digits= "+even);
		System.out.println("odd digit "+odd);
	}

}
