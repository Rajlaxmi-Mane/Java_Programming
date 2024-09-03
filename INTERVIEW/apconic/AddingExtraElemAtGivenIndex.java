package com.apconic;

import java.util.Arrays;

public class AddingExtraElemAtGivenIndex {
	public static void main(String[] args) {
		int[] a= {10,20,30,40,50};
		int[] temp=new int[a.length+1];
		//10,20,30,70,40,50
		int ele=70;
		int index=3;
		int j=0;
		for(int i=0;i<temp.length;i++) {
			if(i!=index) {
				temp[i]=a[j];
				j++;
			}
		}
		temp[index]=ele;
		a=temp;
		System.out.println(Arrays.toString(a));
	}

}
