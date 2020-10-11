package com.Wrapper_Class;

public class Third_Example {

	public static void main(String[] args) {
		
		String price1="211.01";
		String price2="788.99";
		
		System.out.println(price1+price2);
		
		double p1=Double.parseDouble(price1); //converting the string to  double
		double p2=Double.parseDouble(price2);
		
		System.out.println(p1+p2);
		
		double sum =p1+p2;
		
		if(sum==1000){
			System.out.println("passes");
		}
		else{
			System.out.println("failed");
		}

	}

}
