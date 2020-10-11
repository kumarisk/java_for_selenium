package com.Wrapper_Class;

public class Boxing_And_UnBoxing {

	public static void main(String[] args) {
		
		//Auto-Boxing
		int a=90;
		Integer b=a;
		System.out.println(b);
		
		//Boxing
		int x=80;
		Integer y = Integer.valueOf(x);
		System.out.println(y);
		
		//Unboxing
		Integer result=70;
		int newresult = result.intValue();
		System.out.println(newresult);
		
		//Auto-Unboxing
		Integer mark = 50;
		int newmark = mark;
		System.out.println(newmark);
 
	}

}
