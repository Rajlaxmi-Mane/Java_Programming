package com.wrapper;

public class wrapper {
	public static void main(String[] args) {
		//BOXING 
		int a=10;
		Integer a1=a;
		Integer a2=Integer.valueOf(a);
		System.out.println(a1);
		
		double d=34.5;
		Double d1=d;
		System.out.println(d1);
		
		char c='m';
		Character ch=c;
		System.out.println(ch);
		
		boolean b=true;
		Boolean b1=b;
		System.out.println(b);
		
		//UNBOXING 
		
		Integer i=1000;
		int i1=i;
		int i2=Integer.valueOf(i);
		System.out.println(i2);
		
		Short s=34;
		short s2=Short.valueOf(s);
		System.out.println(s2);
		
		Float f4=56.66f;
		float f5=f4;
		float f6=Float.valueOf(f5);
		System.out.println(f5);
		System.out.println(f6);
		
		Character c3='@';
		char c4=c3;
		System.out.println(c4);
		
		
	}

}
