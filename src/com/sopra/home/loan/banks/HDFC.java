package com.sopra.home.loan.banks;

public class HDFC extends RBI{
	
	@Override
	public double getHomeLoanInterestRate() {
		return 10.5;
	}

	public void calculateHomeLoan(double loanAmount, int years) {
        double interestRate = getHomeLoanInterestRate();
        double totalInterest = (loanAmount * interestRate * years) / 100;
        this.totalAmountToPay = (loanAmount + totalInterest);
        printHomeLoanDetails(loanAmount,years, totalAmountToPay);
	}
	
	public String toString() {
		return "HDFC";
	}
}
