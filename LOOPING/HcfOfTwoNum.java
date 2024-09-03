package com.looping;

import java.util.*;

public class HcfOfTwoNum {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int num1 = s.nextInt();
		int num2=s.nextInt();
		while(num1!=num2)
		{
			if(num1>num2) {
				num1=num1-num2;
			}else {
				num2=num2-num1;
			}

		}
		System.out.println(num2);
	}

}
