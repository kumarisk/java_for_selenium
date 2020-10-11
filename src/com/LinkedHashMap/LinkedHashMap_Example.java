package com.LinkedHashMap;

import java.util.LinkedHashMap;

public class LinkedHashMap_Example {

	public static void main(String[] args) {
		
		LinkedHashMap<String, String> lm = new LinkedHashMap<>();
	//it has as a insertion oder
		
		lm.put("111", "Selenium");
		lm.put("222", "Jenkins");
		lm.put("333", "Sikuli");
		lm.put("444", "Git");
		lm.put("555", "Java");
		lm.put("555", "Java"); //duplicates are not allowed
		
		System.out.println(lm);
	

	}

}
