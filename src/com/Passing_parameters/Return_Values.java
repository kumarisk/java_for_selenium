package com.Passing_parameters;

public class Return_Values {

	public static void main(String[] args) {
		
		Return_Values obj1= new Return_Values();
		
		int addition = obj1.add(47, 78);
		System.out.println("addition of a+b="+ addition);
		
		double substation =obj1.sub(99.00, 88.00);
		System.out.println("substrate a-b="+ substation);
		

	}
	
	public int add(int a,int b){
		int c=a+b;
		return c;
	}
	
	public double sub(double a,double b){
		double c=a-b;
		return c;
	}

}
