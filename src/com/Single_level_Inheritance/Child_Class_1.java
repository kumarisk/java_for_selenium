package com.Single_level_Inheritance;

public class Child_Class_1 extends Parent_Class{
	
/*
 Scenario-1:
 			Child class reference and child class object-	This will allow to access all the
 			methods of base(parent) class and child class
 */

	public static void main(String[] args) {
		
		Child_Class_1 obj = new Child_Class_1();
		
		obj.add();
		obj.sub();
		obj.div();
		obj.mul();
		

	}
	
	public void div(){
		System.out.println("child class div method");
	}
	
	public void mul(){
		System.out.println("child class mul method");
	}

}
