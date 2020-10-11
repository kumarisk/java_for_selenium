package com.ArrayList;

import java.util.ArrayList;

public class Example_using_Enhanced_ForLoop {

	public static void main(String[] args) {
		
		ArrayList ob = new ArrayList();
		
		ob.add("hello");
		ob.add("hello");
		ob.add(123);
		ob.add(123);
		ob.add("s");
		ob.add(12.33);
		
		for(Object ad:ob){
			System.out.println(ad);
		}

	}

}
