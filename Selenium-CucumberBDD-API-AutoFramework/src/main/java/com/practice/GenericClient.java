package com.practice;

public class GenericClient extends SpecificClient{

	@Override
	public void login() {
		

	
	}

	@Override
	public void transection() {
		System.out.println("thisismylogoutmethod");
		
	}

	@Override
	public void accountsummary() {
		System.out.println("thisismylogoutmethod");
		
	}

	@Override
	public void monthlystatement() {
		System.out.println("thisismylogoutmethod");
		
	}


	public void logout() {
		System.out.println("thisismylogoutmethod");
		
	}

	@Override
	public void saving() {
		System.out.println("thisismysavingmethod");
		
	}

}
