package com.This_keyword;

public class myVariables {
	
	int x;
	int y;
	int a;
	
	public myVariables(int x,int y, int c){
		this.x=x;
		this.y=y;
		a=c;
		
	}
	
	public void sum(){
		int sum=x+y+a;
		System.out.println("the sum value is " + sum);
	}

	public static void main(String[] args) {
		
		myVariables og = new myVariables(65,75,85);
		og.sum();
		

	}

}
