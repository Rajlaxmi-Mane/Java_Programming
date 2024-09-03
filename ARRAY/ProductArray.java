package ARRAY;

import java.util.*;

public class ProductArray {
	public static void main(String[] args) {
		int arr[] = { 4, 0, 0, 6};
		int ar[] = new int[arr.length];
		int prod = 1;
		boolean zeroflag = false;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != 0) {
				prod = prod * arr[i];
			}
			else {
				zeroflag=true;
			}
		}
		for (int i = 0; i < arr.length; i++) {
			if(!zeroflag) {
			ar[i] = prod / arr[i];
			}else {
				for(int j=0;j<arr.length;j++) {
				if(arr[i]==0) {
					ar[i]=prod;
				}
				}
			
			}
		}
		System.out.println(Arrays.toString(ar));
	}

}
