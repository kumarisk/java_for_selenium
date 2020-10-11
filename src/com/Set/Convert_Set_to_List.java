package com.Set;

import java.util.ArrayList;
import java.util.HashSet;

public class Convert_Set_to_List {

	public static void main(String[] args) {
		
		HashSet<String> st = new HashSet<String>();
		
		
		st.add("java");
		st.add("selenium");
		st.add("BDD");
		st.add("Automation");
		
		System.out.println(st);
		
	//converting set to list	
		ArrayList<String> s = new ArrayList<String>(st);
		
		System.out.println(s.get(3));

	}

}
