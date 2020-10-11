package com.String_Class;

public class Split_Method {

	public static void main(String[] args) {
		
		String tools = "AWS-Jenkins-Selenium-Git-Java";
		
		String[] tool = tools.split("-");
		
		for(int i=0; i<tool.length; i++){
			System.out.println(tool[i]);
			
			if(tool[i].equals("Git")){
				break;
			}
		}

	}

}
