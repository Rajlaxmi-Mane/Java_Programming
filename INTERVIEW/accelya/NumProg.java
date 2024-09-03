package com.accelya;

public class NumProg {
	
	public static void main(String[] args) {
		int num=5468;
		int num1=num;
		int num2=num;
		int sum=0;
		
		int firstdig=0;
		while(num!=0) {
			int dig=num%10;
			if(dig!=0) {
				firstdig=dig;
			}
			sum=sum+dig;
			num/=10;
		}
		if(sum%firstdig==0) {
			System.out.println("yes divisible ");
		} else {
			System.out.println("not divisible");
		}
		boolean flag=false;
		while(num1!=0) {
			int dig=num1%10;
			if(dig%2!=0) {
				flag=true;
				break;
			}
			num1/=10;
		}
		if(flag) {
			System.out.println("yes odd no is there");
		}else {
			System.out.println("no");
		}
		int esum=0;
		int osum=0;
		 while(num2!=0) {
			 int dig=num2%10;
			 if (dig%2==0) {
				 esum=esum+dig;
			 }else {
				 osum=osum+dig;
			 }
			 num2/=10;
		 }
		 System.out.println("difference = "+(esum-osum));
	}
	

}
