package com.simplilearn.session.examples;

import com.simplilearn.models.session.abstractclasses.BankAccount;

public class Account extends BankAccount {

	@Override
	public void balance() {
		System.out.println("Abstract Method Implemtation: Balance");
	}

	@Override
	public void withdraw() {
		System.out.println("Abstract Method Implemtation: Withdraw");
	}

	@Override
	public void deposit() {
		System.out.println("Abstract Method Implemtation: Deposit");
	}

	public static void main(String[] args) {
		Account acc = new Account();
		acc.balance();
		acc.withdraw();
		acc.deposit();
		acc.display();
	}

}
