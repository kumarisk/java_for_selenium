package com.String_Class;

public class Starts_Ends_Methods {

	public static void main(String[] args) {
		
		String test = "Automation Testing";
		
		boolean status = test.startsWith("Automation");
		boolean status1 = test.endsWith("Testing");
		
		System.out.println(status);
		System.out.println(status1);
	}

}
