package com.ArrayList;

import java.util.ArrayList;

public class Example_using_Generic_ArrayList {

	public static void main(String[] args) {
		
		ArrayList<String> st = new ArrayList();
		
		st.add("selenium");
		st.add("automation");
		st.add("java");
		
		for(String s:st){
			System.out.println(s);
		}

	}

}
