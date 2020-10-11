package com.Interface;

public class Sci_Cal implements cal{

	public static void main(String[] args) {
		
		cal ref = new Sci_Cal();
		
		ref.add();
		ref.sub();
		ref.mul();
	//	ref.div();

	}
	
	public void div(){
		System.out.println("this method is from current class(Adv_Cal)");
	}

	public void add() {
		
		System.out.println("this is method 1 from interface");
	}

	public void sub() {
		
		System.out.println("this is method 2 from interface");
	}

	public void mul() {
		
		System.out.println("this is method 3 from interface");
	}

}
