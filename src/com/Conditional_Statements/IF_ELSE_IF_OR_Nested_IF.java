package com.Conditional_Statements;

public class IF_ELSE_IF_OR_Nested_IF {

	public static void main(String[] args) {
		
		String browser = "Safari";
		
		if(browser.equalsIgnoreCase("chrome")){
			System.out.println("run TC's in chrome");
		}
		else if(browser.equalsIgnoreCase("firefox")){
			System.out.println("run TC's in firefox");
		}
		else if(browser.equalsIgnoreCase("IE")){
			System.out.println("run TC's in IE");
		}
		else if(browser.equalsIgnoreCase("safari")){
			System.out.println("run TC's in safari");
		}
		
		else{
			System.out.println("provide valid browser name");
		}

	}

}
