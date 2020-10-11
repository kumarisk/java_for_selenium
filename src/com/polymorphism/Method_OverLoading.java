package com.polymorphism;

/*
 Method can be overloaded if and only if method has the same name but with different signature.
 	Signature:
 		1.Number of arguments
 		2.Types of arguments
 		3.Order of arguments
 */

public class Method_OverLoading {

	public static void main(String[] args) {
		Method_OverLoading ad = new Method_OverLoading();
		ad.add(34, 54);
		ad.add(10, 20, 30);
		ad.add(54.44, 67.77);
		ad.add(59, 78.00);
		ad.add(90.9, 90);

	}
	
	public void add(int a,int b){
		int c=a+b;
		System.out.println("sum of two numbers"+ c);
	}
	
	public void add(int a,int b,int d){
		int c=a+b+d;
		System.out.println("sum of two numbers"+ c);
	}
	
	public void add(double a, double b){
		double c=a+b;
		System.out.println("sum of two numbers"+ c);
	}
	
	public void add(int a,double b){
		double c=a+b;
		System.out.println("sum of two numbers"+ c);
	}
	
	public void add(double a,int b){
		double c=a+b;
		System.out.println("sum of two numbers"+ c);
	}

}
