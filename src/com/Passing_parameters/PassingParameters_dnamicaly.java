package com.Passing_parameters;

public class PassingParameters_dnamicaly {

	public static void main(String[] args) {
		
		PassingParameters_dnamicaly obj= new PassingParameters_dnamicaly();
		
		obj.add(34, 44);
		obj.sub(44.44, 33.99);

	}
	
	public void add(int a,int b){
		int c=a+b;
		System.out.println("adding a+b ="+c);
	}
	
	public void sub(double a,double b){
		double c=a-b;
		System.out.println("subtrating a-b= "+c);
	}


}
