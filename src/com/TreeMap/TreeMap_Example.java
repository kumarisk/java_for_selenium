package com.TreeMap;

import java.util.TreeMap;

public class TreeMap_Example {

	public static void main(String[] args) {
		
		TreeMap<String, String> tm = new TreeMap<>();
	//it does not have any order	
		
		tm.put("000", "Docker");
		tm.put("999", "AWS");
		tm.put("888", "Ansible");
		tm.put("777", "WordPress");
		tm.put("666", "Adobe");
		tm.put("555", "Devops");
		tm.put("555", "Devops"); //duplicates are not allowed
		
		System.out.println(tm);

	}

}
