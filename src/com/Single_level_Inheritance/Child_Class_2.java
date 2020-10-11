package com.Single_level_Inheritance;

public class Child_Class_2 extends Parent_Class{
	
/*
 	Scenario-2:
 				Base(parent) class reference and Base(parent) class object- 	This will allow to access all
 				the methods of base(parent) class only
 */

	public static void main(String[] args) {
		
		Parent_Class obj1 = new Parent_Class();
		
		obj1.add();
		obj1.sub();
		
	}
	
	public void div1(){
		System.out.println("child class div method");
	}
	
	public void mul1(){
		System.out.println("child class mul method");
	}

}
