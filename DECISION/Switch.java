package com.decision_m_stmt;
import java.util.*;

public class Switch {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int cnt=0;
		int num1=s.nextInt();
		if(num1%2==0) {
			cnt++;
		}
		int num2=s.nextInt();
		cnt= num2 % 2 == 0 ? cnt+1 : cnt;
		int num3=s.nextInt();
		cnt=num3 % 2==0 ? cnt+1:cnt;
		switch(cnt) {
		case 1:
		{
			if(num1%2==0) {
				System.out.println(num1);
			}else if(num2%2==0) {
				System.out.println(num2);
			}else {
				System.out.println(num3);
			}
			break;
		}
		case 2:
		{
			if(num1%2==0 && num2%2==0) {
				System.out.println(num1+num2);
			}
			if(num1%2==0 && num3%2==0) {
				System.out.println(num1+num3);
			}
			if(num2%2==0 && num3%2==0) {
				System.out.println(num3+num2);
			}
			break;
		}
		case 3:
		{
			System.out.println(num1*num2*num3);
			break;
		}
		}
	}

}
