package com.playwithobj;

public class MethodReturningObjRef {
	public static void main(String[] args) {
		MethodReturningObjRef m=refReturn();
		System.out.println(m);
		System.out.println();
		MethodReturningObjRef m2=refReturn();
		System.out.println(m2);
		
	}
	// FACTORY METHODS IT GENERATES THE OBJECT 
	public static MethodReturningObjRef refReturn() {
		MethodReturningObjRef m=new MethodReturningObjRef();
		System.out.println(m);
		return m;
	}

}
