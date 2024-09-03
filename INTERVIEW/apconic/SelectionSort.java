package com.apconic;

import java.util.Arrays;

public class SelectionSort {
 public static void main(String[] args) {
	int [] a= {23,65,12,5,75,3,4,7,8,9,76,4,3};
	for(int i=0;i<a.length;i++) {
		int min=i;
		for(int j=i+1;j<a.length;j++) {
			if(a[j]<a[min]) {
				min=j;
			}
		}
		int temp=a[min];
		a[min]=a[i];
		a[i]=temp;
	}
	System.out.println(Arrays.toString(a));
}

}
