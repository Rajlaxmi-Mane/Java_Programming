package com.apconic;

import java.util.Arrays;

public class ArrayRotateAntiClock {
	public static void main(String[] args) {
		int[] a= {29,49,23,87,76,2,2,45,43,22};
		System.out.println("ORIGINAL ARRAY :"+Arrays.toString(a));
		// CLOCKWISE DIRECTION AND ANTICLOCKWISE ROTATION
		//  22,29,49,23,87,76,2,2,45,43-clockwise
		//49,23,87,76,2,2,54,43,22,29-anti
		int n=3;
		while(n>0) {
			int temp=a[0];
			for(int i=1;i<a.length;i++) {
				a[i-1]=a[i];
			}
			a[a.length-1]=temp;
			n--;
		}
		System.out.println("ROTATED ARRAY IN ANTI-CLOCKWISE "+Arrays.toString(a));
		
	}

}
