package com.Set;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class LinkedHashSet_Example {

	public static void main(String[] args) {
		
		LinkedHashSet<String> st = new LinkedHashSet<String>();
		
	//it will display in insertion order	
		
		
		st.add("java");
		st.add("selenium");
		st.add("BDD");
		st.add("Automation");
		
		System.out.println(st);

	}

}
