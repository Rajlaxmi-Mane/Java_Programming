package idox;

import java.util.Arrays;

/*
 * there is a given array in which you have to find leader elements
 * leader means the elements which is greater than or equal to the all its right side elements;
 */

public class ArrayManipulation {
	public static void main(String[] args) {
		int[] arr = {12, 5, 32, 9, 4, 5, 2};
		int[] res = new int[arr.length];
		int k = 0;
		boolean flag = true;
		
		for(int i=0; i<arr.length-1; i++) {
			flag = true;
			for(int j=i+1; j<arr.length; j++) {
				if(arr[i] < arr[j]) {
					flag= false;
				}
			}
			if(flag) {
				res[k++] = arr[i];
			}
		}
		res[k] = arr[arr.length-1];
		System.out.println(Arrays.toString(res));
	}

}
