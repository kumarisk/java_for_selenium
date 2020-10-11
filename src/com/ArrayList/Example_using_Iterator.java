package com.ArrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class Example_using_Iterator {

	public static void main(String[] args) {
		
		ArrayList ob = new ArrayList();
		
		ob.add("hello");
		ob.add("hello");
		ob.add(123);
		ob.add(123);
		ob.add("s");
		ob.add(12.33);
		
		Iterator it = ob.iterator();
		
		while(it.hasNext()){
			Object s = it.next();
			System.out.println(s);
		}

	}

}
