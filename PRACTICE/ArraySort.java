package com.practice;
import java.util.*;

public class ArraySort {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter size");
		int size=s.nextInt();
		int []  arr=new int[size];
		System.out.println("enter array elemennts :");
		for (int i=0;i<arr.length;i++) {
			arr[i]=s.nextInt();
		}
		int[] a=sort(arr);
		System.out.println("Sorted array is :");
		for (int i=0;i<arr.length;i++) {
			System.out.println(a[i]);
		}
	}
	public static int[] sort(int[] a) {
		Arrays.sort(a);
		return a;
	}

}
