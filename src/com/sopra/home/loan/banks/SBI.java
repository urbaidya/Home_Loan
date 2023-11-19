package com.sopra.home.loan.banks;

public class SBI extends RBI{
	
	public void calculateHomeLoan(double loanAmount, int years) {
        double interestRate = getHomeLoanInterestRate();
        double totalInterest = (loanAmount * interestRate * years) / 100;
        this.totalAmountToPay = (loanAmount + totalInterest);
        printHomeLoanDetails(loanAmount,years, totalAmountToPay);
	}
	
	public String toString() {
		return "SBI";
	}
}
