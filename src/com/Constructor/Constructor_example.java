package com.Constructor;

public class Constructor_example {
	
/*
 	when we create a object to the class automatically the constructor in that class will be 
 	initialized
 */

	public static void main(String[] args) {
		
		Constructor_example ob = new Constructor_example();
		ob.resutls();

	}
	
	public Constructor_example(){
		System.out.println("welcome to constructor");
	}
	
	public void resutls(){
		System.out.println("marks ");
	}

}
