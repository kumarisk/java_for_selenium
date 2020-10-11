package com.Wrapper_Class;

public class Second_Example {

	public static void main(String[] args) {
		
		String price1="211";
		String price2="789";
		
		System.out.println(price1+price2);
		
		int p1=Integer.parseInt(price1); //converting the string to int 
		int p2=Integer.parseInt(price2);
		
		System.out.println(p1+p2);
		
		int sum =p1+p2;
		
		if(sum==1000){
			System.out.println("passes");
		}
		else{
			System.out.println("failed");
		}

	}

}
