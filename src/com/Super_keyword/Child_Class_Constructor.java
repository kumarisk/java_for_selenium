package com.Super_keyword;

public class Child_Class_Constructor extends Parent_Class_constructor{
	
	public Child_Class_Constructor(){
		
		System.out.println("i am in child class");
	}
	
	public Child_Class_Constructor(String name){
		
		super(name);
		System.out.println("i am in child class con " + name);
	}

	public static void main(String[] args) {
		
		Child_Class_Constructor c = new Child_Class_Constructor("kumar"); //if we create object to child class also first/default it will call parent class constructor. 

	}

}
