package com.looping;
import java.util.*;

public class factors {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int num=s.nextInt();
		int i=1;
		while(i<=num) {
			if(num%i==0) {
				System.out.println(i);
			}
			i++;
		}
	}

}
