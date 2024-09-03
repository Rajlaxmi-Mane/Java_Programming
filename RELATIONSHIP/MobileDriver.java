package com.relationship;

class Battery{
	int cp;
	int vl;
	Battery(int cp,int vl){
	this.cp=cp;
	this.vl=vl;
	}
}

class Mobile{
	String br;
	double p;
	Mobile(String br,double p){
		this.br=br;
		this.p=p;
	}
	Battery b=null;
	public void createBattery() {
		b=new Battery(5000,5);
	}
}
public class MobileDriver {
	public static void main(String[] args) {
		Mobile m=new Mobile("apple",90000);
		System.out.println(m.br);
		System.out.println(m.p);
		m.createBattery();
		System.out.println(m.b.cp);
		System.out.println(m.b.vl);
	}

}
