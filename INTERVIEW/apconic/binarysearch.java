package com.apconic;

public class binarysearch {
	public static void main(String[] args) {
		int[] a= {10,20,30,40,50};
		int st=0;
		int end=a.length-1;
		int key=50;
		boolean flag=false;
		while(st<=end) {
			int mid=(st+end)/2;
			if(a[mid]==key) {
				flag=true;
				break;
			}else if(a[mid]>key) {
				end=mid-1;
			}else {
				st=mid+1;
			}
			
		}
		System.out.println(flag);
	}

}
