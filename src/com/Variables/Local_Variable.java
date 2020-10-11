package com.Variables;

public class Local_Variable {

	public static void main(String[] args) {
		
		Local_Variable lc = new Local_Variable();
		lc.local();
		
	}
	
	public void local(){
		int a=1;//variables inside method are local variables these variables can not initialize from outside the method
		System.out.println(a);
	}

}
