package com.Variables;

public class Instance_Variable_Static_NonStatic {
	
	int x=99;//non-static variable
	static int z=88; //static variable

	public static void main(String[] args) {
		
		Instance_Variable_Static_NonStatic ob = new Instance_Variable_Static_NonStatic();
		System.out.println(ob.x);
		
		System.out.println(z); 

	}
	
	public void meth(){
		System.out.println(x);
		System.out.println(z);
	}

}
