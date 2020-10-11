package com.Interface;

public class Variable_from_Interface implements cal{

	public static void main(String[] args) {
		
		Variable_from_Interface re = new Variable_from_Interface();
		
		re.add();
		re.sub();
		re.mul();
		System.out.println(x);
		//x=9; //we cannot change the values declared in the interface
		
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
