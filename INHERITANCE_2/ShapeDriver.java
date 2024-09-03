package com.inheritance2;

class Shape1{
	String shape;
	public Shape1(String shape){
		this.shape=shape;
	}	
}

class Triangle1 extends Shape1{
	double height;
	double base;
	Triangle1(String shape,double height,  double base){
		super(shape);
		this.height=height;
		this.base=base;	
	}
	public void area() {
		double area=0.5*height*base;
		System.err.println("SHAPE IS : "+shape);
		System.out.println("HEIGHT = "+height);
		System.out.println("BASE =" +base);
		System.out.println("AREA OF TRIANGLE IS : "+area);
	}
}

class Circle extends Shape1{
	double radius;

	public Circle(String shape, double radius) {
		super(shape);
		this.radius = radius;
	}
	public void area() {
		double area=3.14*radius*radius;
		System.err.println("SHAPE IS : "+shape);
		System.out.println("RADIUS = "+radius);
		System.out.println("AREA OF CRCLE IS : "+area);
	}
	
}

class Rect extends Shape1{
	double l;
	double b;
	public Rect(String shape, double l, double b) {
		super(shape);
		this.l = l;
		this.b = b;
	}
	public void area() {
		double area=l*b;
		System.err.println("SHAPE IS : "+shape);
		System.out.println("LENGHT = "+l);
		System.out.println("BREADTH = "+b);
		System.out.println("AREA OF RECTANGLE IS : "+area);
	}
}

class Square extends Shape1{
	double side;

	public Square(String shape,double side) {
		super(shape);
		this.side = side;
	}
	public void area() {
		double area=side*side;
		System.err.println("SHAPE IS : "+shape);
		System.out.println("SIDE = "+side);
		System.out.println("AREA OF SQUARE IS : "+area);
	}
}

public class ShapeDriver {
	public static void main(String[] args) {
		Square s=new Square("SQUARE",30);
		s.area();
		Rect r=new Rect("RECTANGLE",10.87, 20);
		r.area();
		Triangle1 t=new Triangle1("TRIANGLE",3,2);
		t.area();
		Circle c=new Circle("CIRCLE",4.8);
		c.area();
	}

}
