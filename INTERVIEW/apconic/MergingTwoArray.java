package com.apconic;
import java.util.*;

public class MergingTwoArray {
	public static void main(String[] args) {
		int[] a1= {10,20,30,40,50};
		int[] a2= {60,70,80,90,100};
		int[] res=new int[a1.length+a2.length];
		int index=0;
		for(int i=0;i<a1.length;i++) {
			res[index]=a1[i];
			index++;
		}
		for(int i=0;i<a2.length;i++) {
			res[index]=a2[i];
			index++;
		}
		System.out.println(Arrays.toString(res));
		
		index=0;
		for(int i=0;i<a1.length;i++) {
			res[index]=a1[i];
			index+=2;
		}
		index=1;
		for(int i=0;i<a2.length;i++) {
			res[index]=a2[i];
			index +=2;
		}
		System.out.println(Arrays.toString(res));
		
	}

}
