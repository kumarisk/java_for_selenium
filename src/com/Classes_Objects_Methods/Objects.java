package com.Classes_Objects_Methods;

public class Objects {
	
	int a=89;
	int b=90;

	public static void main(String[] args) {
		
		//create object for class 
		
		Objects obj = new Objects();
		
		obj.trying();
		System.out.println(obj.a);
		System.out.println(obj.b);
		

	}
	
	public void trying(){
		int x=9;
		int y=8;
		int c=x-y;
		System.out.println(c);
	}

}
