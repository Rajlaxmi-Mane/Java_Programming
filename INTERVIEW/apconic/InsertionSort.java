package com.apconic;

import java.util.Arrays;

public class InsertionSort {
	public static void main(String[] args) {
		int[] a= {33,54,2,345,56,42,21,3,7,7,54,3,2};
		for(int i=1;i<a.length;i++) {
			int key=a[i];
			for(int j=i-1;j>=0;j--) {
				if(key<a[j]) {
					a[j+1]=a[j];
					a[j]=key;
				}
			}
		}
		System.out.println(Arrays.toString(a));
	}

}
