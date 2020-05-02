package com.simplilearn.models.assignments.interfaces;

public interface Account {
	String accountTypePrompt = "Enter Account Type S/C", transactionTypePrompt = "Enter transaction type: (W/D/B)",
			invalidAccountTypePrompt = "Invalid account type, please choose one among S/C",
			invalidTransactionTypePrompt = "Invalid transaction type, please choose one among W/D/B",
			amountPrompt = "Enter Amount in decimal number", amountError = "Invalid entry. Must be a decimal number",
			maxAttemptPrompt = "Maximum attempts reached, initiate new transaction",
			maxLimitPrompt = "MaxLimit reached",
			insufficientFundsPrompt = "Insufficient Balance";
	
	float INITIAL_BALANCE = 50000, DAILY_LIMIT = 10000;

	void readUserInput();

	void displayUserInput();
	
	void processUserInput();

	void balance();

	void withdraw();

	void deposit();

}
