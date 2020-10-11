package com.polymorphism;

public class SBI_Bank extends Method_Overriding_RealTime_Scenario_RBIBank implements Loan{

	public static void main(String[] args) {
	
		SBI_Bank loan = new SBI_Bank();
		loan.HomeLoanRate();

	}
	
	public void HomeLoanRate(){
		System.out.println("home loan is 15 %");
	}

	public void homeloan() {
		System.out.println("this is for home loan");
		
	}

	public void carloan() {
		System.out.println("this is for car loan");
		
	}

}
