package com.apconic;

import java.util.Arrays;

public class ArrayRotation {
	public static void main(String[] args) {
		int[] a= {29,49,23,87,76,2,2,45,43,22};
		System.out.println("ORIGINAL ARRAY :"+Arrays.toString(a));
		// CLOCKWISE DIRECTION AND ANTICLOCKWISE ROTATION
		//  22,29,49,23,87,76,2,2,45,43-clockwise
		//49,23,87,76,2,2,54,43,22,29-anti
		int n=4;
		while(n>0) {
			int temp=a[a.length-1];
			for(int i=a.length-2;i>=0;i--) {
				a[i+1]=a[i];
			}
			a[0]=temp;
			n--;
		}
		System.out.println("ROTATED ARRAY IN CLOCKWISE "+Arrays.toString(a));
		
	}

}
