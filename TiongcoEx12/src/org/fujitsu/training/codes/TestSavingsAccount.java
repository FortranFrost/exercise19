package org.fujitsu.training.codes;

public class TestSavingsAccount {

	public static void main(String[] args) {
		SavingsAccount interest = new SavingsAccount(10000.50, 0.10);

		interest.setDeposit(20000.00);
		interest.Deposit();
		interest.setWithdraw(30000.00);
		interest.Withdraw();

		interest.getAddInterest();

	}
}
