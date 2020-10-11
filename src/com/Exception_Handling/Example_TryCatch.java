package com.Exception_Handling;

public class Example_TryCatch {

	public static void main(String[] args) {
		
		System.out.println("program started");
	
//run time exceptions	
		
		try{
			int i=10/0;
			System.out.println(i);
			
		}catch(ArithmeticException a){
			System.out.println("please provide a integer which is > 0");
		}
		catch(Exception e){
			System.out.println("the exception is " + e);
		}
		
		//we can use catch or finally
		finally{
			System.out.println("something went wrong please check");
			System.out.println("program end");
		}

	}

}
