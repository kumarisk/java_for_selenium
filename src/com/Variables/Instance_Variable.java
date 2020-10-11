package com.Variables;

public class Instance_Variable {
	
	int x=5;//instance value -outside method inside the class these can initialize any where in the class
	int y=9;//"

	public static void main(String[] args) {
		Instance_Variable iv = new Instance_Variable();
		iv.instance();
		System.out.println(iv.x);
		System.out.println(iv.y);
		Instance_Variable iv1 = new Instance_Variable();
		iv1.instance();
		System.out.println(iv1.x);
		System.out.println(iv1.y);
		Instance_Variable iv2 = new Instance_Variable();
		iv2.instance();
		System.out.println(iv2.x);
		System.out.println(iv2.y);

	}
	
	public void instance(){
		System.out.println("x value is"+" "+x+" "+"y value is"+" "+y);
	}

}
