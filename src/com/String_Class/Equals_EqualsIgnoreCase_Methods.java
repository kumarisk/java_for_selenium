package com.String_Class;

public class Equals_EqualsIgnoreCase_Methods {

	public static void main(String[] args) {
		
		String actual = "Automation testing is so intresting";
		String excepted = "automation testing is so intresting";
		
		boolean status = actual.equals(excepted);
		System.out.println(status);
		
		boolean status2 = actual.equalsIgnoreCase(excepted);
		System.out.println(status2);
		

	}

}
