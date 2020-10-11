package com.HashMap;

import java.util.HashMap;
import java.util.Map;

public class HashMap_Example {

	public static void main(String[] args) {
		
		HashMap<String, String> ma = new HashMap<>();
		//it does not have any order		
		
		ma.put("123", "Atomation");
		ma.put("456", "Java");
		ma.put("789", "Selenium");
		ma.put("011", "BDD");
		ma.put("013", "Jenkins");
		ma.put("014", "Git");
		ma.put("014", "Git"); //duplicates will not allow
		
		System.out.println(ma);
		
		String value = ma.get("789");
		
		System.out.println(value);
		
		for(Map.Entry<String,String> data : ma.entrySet()){
			System.out.println("key value is "+data.getKey()+" and value is "+data.getValue());
		}

	}

}
