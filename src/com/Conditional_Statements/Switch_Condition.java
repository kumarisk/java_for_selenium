package com.Conditional_Statements;

public class Switch_Condition {

	public static void main(String[] args) {
		
		int emp_rank=5;
		
		switch(emp_rank)
		{
		case 1: 
			System.out.println("bad performance");
		break;
		
		case 2:
			System.out.println("low performance");
		break;
		
		case 3:
			System.out.println("mediam performance");
		break;	
			
		case 4:
			System.out.println("good performance keep it up");
		break;
		
		case 5:
			System.out.println("best performance");
		break;
		
		default: 
			System.out.println("provide valid rank number");
		}

	}

}
