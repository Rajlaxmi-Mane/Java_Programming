package com.apconic;
import java.util.*;

public class reverseArrayManipulation {
	public static void main(String[] args) {
		
		int[] a= {10,20,30,40,50,60};
		int st=0;
		int end=a.length-1;
		int temp=a[st];
		System.out.println(Arrays.toString(a));
		while(st<end) {
			temp=a[st];
			a[st]=a[end];
			a[end]=temp;
			st++;
			end--;
		}
		System.out.println(Arrays.toString(a));
		
	}

}
