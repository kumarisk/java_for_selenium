package com.Constructor;

public class Constructor_Overloadding {
	
	int results;

	public static void main(String[] args) {
		
		Constructor_Overloadding ob = new Constructor_Overloadding(45);

	}
	
	public Constructor_Overloadding(){
		System.out.println("welcome to constructor");
	}
	
	public Constructor_Overloadding(String schoolname){
		System.out.println("welcome to "+ schoolname + " shool");//string concatenation
	}
	
	public Constructor_Overloadding(int marks){
		System.out.println("the marks scored "+ marks);
	}
	
	public Constructor_Overloadding(int marks, String schoolname){
		System.out.println("welcome to constructor");
	}
	
	public Constructor_Overloadding(String schoolname, int marks){
		System.out.println("welcome to constructor");
	}
	
	public void resutls(){
		System.out.println("marks are 70");
	}

}
