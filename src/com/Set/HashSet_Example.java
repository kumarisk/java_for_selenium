package com.Set;

import java.util.HashSet;

public class HashSet_Example {

	public static void main(String[] args) {
		
		HashSet<String> st = new HashSet<String>();
		
		
		st.add("java");
		st.add("selenium");
		st.add("BDD");
		st.add("Automation");
		
		System.out.println(st);
		
		for(String a:st){
			System.out.println(a);
		}
		

	}

}
