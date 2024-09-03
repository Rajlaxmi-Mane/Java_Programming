package com.apconic;

import java.util.Arrays;

public class BubbleSort {
	public static void main(String[] args) {
		int[] arr= {70,3,75,23,12,9,65,77,33,7,54};
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[j]<arr[i]) {
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		System.out.println(Arrays.toString(arr));
	}

}
