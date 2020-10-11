package com.This_keyword;

public class myDrivers {
	
	public myDrivers(){
		this("automation");
		System.out.println("loading mydrivers ");
	}
	
	public myDrivers(String name){
		this(65);
		System.out.println("the name is " +name);
	}
	
	public myDrivers(int count){
		System.out.println("the count is "+ count);
	}
	
	public void display(){
		System.out.println("this is display method");
	}
	
	public static void main(String[] args){
		
		myDrivers ob = new myDrivers();
		//myDrivers ob1 = new myDrivers("hi");
		//myDrivers ob2 = new myDrivers(45);
		
		
		
	}

}
