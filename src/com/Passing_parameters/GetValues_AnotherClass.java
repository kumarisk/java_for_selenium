package com.Passing_parameters;

public class GetValues_AnotherClass {
	
	public static void main(String[] args){
	
	Parameters_class obj2= new Parameters_class();
	
	 int multi = Parameters_class.mul(5, 5);
	 System.out.println(multi);
	 
	 int addition = obj2.add(10, 20);
	 System.out.println(addition);
	 
	 double subtraction = obj2.sub(55.555, 44.444);
	 System.out.println(subtraction);
	 
	 
	
	}
}
