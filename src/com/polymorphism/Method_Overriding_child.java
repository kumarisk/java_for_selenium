package com.polymorphism;

public class Method_Overriding_child extends Method_Overriding_parent{

	public static void main(String[] args) {
		
		Method_Overriding_child obj= new Method_Overriding_child();
		obj.display();
		obj.show();
		obj.result();
		
		Method_Overriding_parent obj1 = new Method_Overriding_parent();
		obj1.display();
		obj1.show();
		
		Method_Overriding_parent obj2 = new Method_Overriding_child();
		obj2.display();
		obj2.show();
		
//invalid  //Method_Overriding_child obj3 = new Method_Overriding_parent();

	}
	
	public void display(){
		System.out.println("display method is from child class");
	}
	
	public void show(){
		System.out.println("show methos is from child class");
	}
	
	public void result(){
		System.out.println("this is from child class");
	}

}
