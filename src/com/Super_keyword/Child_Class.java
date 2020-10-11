package com.Super_keyword;

public class Child_Class extends Parent_Class{
	
	int int_rate=10;

	public static void main(String[] args) {
	
	/*
	 	Super keyword we can't use non-static variables/methods in static 
	 */
		
		Child_Class ir = new Child_Class();
		
		ir.showIntRatePvtBank();

	}
	
	public void showIntrate(){
		System.out.println("i am in the child class");
	}

	
	public void showIntRatePvtBank(){
		showIntrate();
		super.showIntrate();
		System.out.println("current interesr rate for private bank is " +super.int_rate); //here i calling the variable from the parent class by using super keyword.
	}

}
