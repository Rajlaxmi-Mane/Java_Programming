package com.looping;
import java.util.*;
public class factorial {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int num=s.nextInt();
		int i=2;
		int res=1;
		while(i<=num) {
			res=res*i;
			i++;
		}
		System.out.println(res);
	}

}
