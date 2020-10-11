package com.Exception_Handling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Example_Throws_Exception {

	public static void main(String[] args) throws InterruptedException, FileNotFoundException {
		
		System.out.println("start program");
		
		Thread.sleep(10000);
		FileInputStream i = new FileInputStream("");

	}
	
//instead of giving individual exception we can give default exception like "Exception"	
	public static void example1() throws Exception{
		
		System.out.println("start program");
		
		Thread.sleep(10000);
		FileInputStream i = new FileInputStream("");

	}

//instead of using throws we can use try catch block	
	public static void example2(){
		
		System.out.println("start program");
		
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		try {
			FileInputStream i = new FileInputStream("");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

	}

}
