package com.Variables;

public class Constructor {

		int x;//instance value -outside method inside the class these can initialize any where in the class
		int y;//"
		int a=90;
		
//Constructor- it must created with the class name.		
	public 	Constructor(int x, int y){
		this.x=x;
		this.y=y;
	}

		public static void main(String[] args) {
			Constructor iv = new Constructor(4,5);
			iv.instance();
			System.out.println(iv.x);
			System.out.println(iv.y);
			Constructor iv1 = new Constructor(6,7);
			iv1.instance();
			System.out.println(iv1.x);
			System.out.println(iv1.y);
			Constructor iv2 = new Constructor(8,9);
			iv2.instance();
			System.out.println(iv2.x);
			System.out.println(iv2.y);

		}
	
	public void instance(){
		int a =80;
		System.out.println(a);
		System.out.println("x value is"+" "+x+" "+"y value is"+" "+y);
	}

}
