package com.simplilearn.models.session.interfaces;

public interface BankAccount extends ManageAccount,DisplayAccount {
	void deposit();
	void balance();
	void withdraw();
	default void nonabstractmethod() {System.out.println("Non Abstract method in interfaces must have only default / static modifier");};
}

interface DisplayAccount {
	void displayAccountDetails();
}

interface ManageAccount {
	void openAccount();
	void closeAccount();
}
