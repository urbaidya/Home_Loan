package com.sopra.home.loan.banks;

public class RBI implements Bank{
	
	public double totalAmountToPay;
	

	@Override
	public double getHomeLoanInterestRate() {
		return 8.4;
	}
	
	public void printHomeLoanDetails(double loanAmount, int years, double totalAmountToPay) {
		System.out.println("FOR "+this+", HOME LOAN DETAILS WILL BE:");
		System.out.println("Loan Amount: ₹ " + loanAmount);
		System.out.println("Loan Duration: " + years + " years");
		System.out.println("Total amount to pay: ₹ " + totalAmountToPay);
	}
	
	public void getHomeLoan(String name) {
		System.out.println("Loan Granted");
		System.out.println(name+" now you have to pay loan of ₹ "+totalAmountToPay+" to "+this);
	}

}
