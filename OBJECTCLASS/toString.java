package com.ObjectClass;
class Demo{
	int id;
	String name;
	double sal;
	public Demo(int id, String name, double sal) {
		super();
		this.id = id;
		this.name = name;
		this.sal = sal;
	}
@Override
public String toString() {
	return "Demo [name="+name+",id="+id+",sal="+sal+"]";
}
}

public class toString {
	public static void main(String[] args) {
		Demo d=new Demo(8,"maithili",76000);
		Demo d1=new Demo(5,"pooja",56000);
		System.out.println(d);
		System.out.println(d1.toString());
		Demo d3=new Demo(3,"madhav",76000);
		System.out.println(d3);
	}

}
