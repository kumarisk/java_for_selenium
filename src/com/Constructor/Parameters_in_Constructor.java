package com.Constructor;

public class Parameters_in_Constructor {
	
	int result;

	public static void main(String[] args) {
		
		Parameters_in_Constructor obje = new Parameters_in_Constructor(75);
		obje.resutls();
	}
	
	public Parameters_in_Constructor(int marks){
		result = marks;
	}
	
	public void resutls(){
		System.out.println("final marks is "+result);
	}

}
