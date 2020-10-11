package com.Single_level_Inheritance;

public class Child_Class_3 extends Parent_Class{
	
/*
 	Scenario-3:
 				Base(parent) class reference and Child class object- 	This will allow to access
 				all the methods of base(parent) class only and not the child class methods
 */

	public static void main(String[] args) {
		
		Parent_Class ob = new Child_Class_3();
		
		ob.add();
		ob.sub();
		
	}
	
	public void div2(){
		System.out.println("child class div method");
	}
	
	public void mul2(){
		System.out.println("child class mul method");
	}

}
