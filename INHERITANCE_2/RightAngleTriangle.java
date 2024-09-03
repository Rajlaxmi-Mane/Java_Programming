package com.inheritance2;

class Shape{
	double area;

	public Shape(double area) {
		super();
		this.area = area;
	}
	
	
}

class Triangle extends Shape{
	double base;
	double length;
	public Triangle( double base, double length) {
		super(base*length);
		this.base = base;
		this.length = length;
	}
	
	
}
class RightAngleTriangl extends Triangle {
	int a=10;

	public RightAngleTriangl(double base, double length, int a) {
		super(base, length);
		this.a = a;
	}
	

}

public class RightAngleTriangle{
	public static void main(String[] args) {
		RightAngleTriangl r=new RightAngleTriangl(23,7,23);
		System.out.println("Area = "+r.area);
		System.out.println("base = "+r.base);
		System.out.println("Length = "+r.length);
		System.out.println(r.a);
		
	}
}
