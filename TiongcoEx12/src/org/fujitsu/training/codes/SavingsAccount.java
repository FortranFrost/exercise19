package org.fujitsu.training.codes;

public class SavingsAccount {

	private Double interest;

	protected SavingsAccount() {
		deposit = 0.0;
		interestRate = 0.0;
	}

	private Double balance;
	private Double interestRate;
	private Double deposit;
	private Double withdraw;
	private Double addInterest;

	public SavingsAccount(Double balance, Double interestRate) {
		this();
		this.balance = balance;
		this.interestRate = interestRate;
	}

	public Double getDeposit() {
		return deposit;
	}

	public void setDeposit(Double deposit) {
		this.deposit = deposit;
	}

	public Double getWithdraw() {
		return withdraw;
	}

	public void setWithdraw(Double withdraw) {
		this.withdraw = withdraw;
	}

	// Gives the amount balance after deposit
	public void Deposit() {
		this.balance = balance + deposit;
		System.out.printf("Your new balance is: %s \n", balance);
	}

	// Gives the amount balance after withdrawal
	public void Withdraw() {
		this.balance = balance - withdraw;
		if (balance < 0) {
			System.out.println("Sorry you cannot withdraw more than your balance");
		} else {
			System.out.printf("Your new balance is after withdrawing %s is: %s \n", withdraw, balance);
		}
	}

	public void getAddInterest() {
		interest = balance * (interestRate / 12);
		addInterest = balance + interest;
		if (addInterest < 0) {
			System.out.println("invalid value");
		} else {
			System.out.printf("Your balance with interest is: %s \n", addInterest);
		}
	}
}
