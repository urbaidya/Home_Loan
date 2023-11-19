package com.sopra.home.loan;

import java.util.Scanner;

import com.sopra.home.loan.banks.HDFC;
import com.sopra.home.loan.banks.ICICI;
import com.sopra.home.loan.banks.SBI;

public class HomeLoanSystem {

	private double loanAmount;
	private int years;
	private SBI sbi;
	private HDFC hdfc;
	private ICICI icici;

	public HomeLoanSystem() {
		this.sbi = new SBI();
		this.hdfc = new HDFC();
		this.icici = new ICICI();
	}

	public void getDifferentOptions() {
		getLoanDetails();
		System.out.println();
		sbi.calculateHomeLoan(loanAmount, years);
		System.out.println();
		hdfc.calculateHomeLoan(loanAmount, years);
		System.out.println();
		icici.calculateHomeLoan(loanAmount, years);
		System.out.println();
		giveLoan();
	}

	private void giveLoan() {
		System.out.println();
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter your Full Name: ");
		String name = sc.nextLine();
		System.out.println("Which bank will you go ahead with");
		System.out.println("1. SBI");
		System.out.println("2. HDFC");
		System.out.println("3. ICICI");
		int bankSelected = sc.nextInt();
		switch (bankSelected) {
		case 1:
			sbi.getHomeLoan(name);
			break;
		case 2:
			hdfc.getHomeLoan(name);
			break;
		case 3:
			icici.getHomeLoan(name);
			break;
		}
	}

	private void getLoanDetails() {
		System.out.println("===========================================");
		System.out.println("== WELCOME TO THE HOME LOAN AAPPLICATION ==");
		System.out.println("===========================================");
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Loan Amount: ");
		this.loanAmount = Double.parseDouble(sc.nextLine());
		System.out.print("Enter Loan Tenure(in years): ");
		this.years = Integer.parseInt(sc.nextLine());
	}
}
