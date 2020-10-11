package com.String_Class;

public class Contains_Method {

	public static void main(String[] args) {
		

		String actual = "Automation testing is so intresting";
		String excepted = "testing";
		
		boolean status = actual.contains(excepted);
		System.out.println(status);

	}

}
