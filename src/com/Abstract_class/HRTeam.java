package com.Abstract_class;

public class HRTeam extends ITTeam{

	public static void main(String[] args) {
		
		HRTeam em = new HRTeam();
		
		em.devices();
		em.work();
		em.salary();
		em.bonus();

	}

	@Override
	public void salary() {
		System.out.println("6 LPA ");
		
	}
	
	public void bonus(){
		System.out.println("bonus is 5 Lakhs");
	}

}
