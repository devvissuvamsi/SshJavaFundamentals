package com.simplilearn.assignments.accountapp;

import java.util.Scanner;
import com.simplilearn.models.assignments.adaptorclasses.AccountAppAdaptor;

public class AccountApp extends AccountAppAdaptor {

	public static Scanner scan = new Scanner(System.in);

	private float dailyLimit;
	private float initialBalance;
	private float balance;
	private int withdraw, deposit;
	private char accountOptionSelected, transactionOptionSelected;


	public AccountApp(){
		setDailyLimit(DAILY_LIMIT);
		setInitialBalance(INITIAL_BALANCE);
		setBalance(getInitialBalance());
	}
	public static void main(String[] args) {
		String performAnotherTransaction = "Yes";
		String userInputAnotherTransaction = "Yes";
		int counter = 0;
		
		do {
			counter++;
			System.out.println("*****************************************************");
			System.out.println("Transaction " + counter);
			System.out.println("*****************************************************");
			AccountApp app = new AccountApp();
			try {
				app.readUserInput();
			} catch (NumberFormatException e) {
				System.out.println(e.getMessage());
				System.exit(0);
			}
			app.processUserInput();
			app.displayUserInput();
			System.out.println("Do you want to initiate another transaction: Yes/No");
			performAnotherTransaction = scan.next();
		}
		while(performAnotherTransaction.equalsIgnoreCase(userInputAnotherTransaction));
		
	}


	@Override
	public void readUserInput() throws NumberFormatException {
		System.out.println(accountTypePrompt);
		
		setAccountOptionSelected(scan.next().charAt(0));

		if (getAccountOptionSelected() == 'C') {
			System.out.println(transactionTypePrompt);
			setTransactionOptionSelected(scan.next().charAt(0));
		} else if (getAccountOptionSelected() == 'S') {
			System.out.println(transactionTypePrompt);
			setTransactionOptionSelected(scan.next().charAt(0));
		} else {
			System.out.println(invalidAccountTypePrompt);
			this.readUserInput();
		}

		while ("WDB".indexOf(getTransactionOptionSelected()) == -1) {
			System.out.println(invalidTransactionTypePrompt);
			System.out.println(transactionTypePrompt);
			setTransactionOptionSelected(scan.next().charAt(0));
			if ("WDB".indexOf(getTransactionOptionSelected()) != -1) {
				break;
			}
		}

		switch (getTransactionOptionSelected()) {
		case 'D':
			setDeposit((int)validateAndGetInputAmount());
			break;
		case 'W':
			setWithdraw((int)validateAndGetInputAmount());
			break;
		default:
			break;
		}
	}

	@Override
	public void displayUserInput() {
		System.out.println("*** Your selected choices ****");
		System.out.println("Account type: " + getAccountOptionSelected());
		System.out.println("Transaction type: " + getTransactionOptionSelected());
		System.out.println("Initial Balance: " + getInitialBalance());
		System.out.println("Deposit Amount: " + getDeposit());
		System.out.println("Withdraw Amount: " + getWithdraw());
		System.out.println("Balance Amount: " + getBalance());
	}

	@Override
	public void balance() {
		System.out.println("Balance: " + getBalance());
	}

	@Override
	public void withdraw() {
		boolean valid = true;
		
		if(getWithdraw() > getBalance()) {
			valid = false;
			System.out.println(insufficientFundsPrompt);
			// throw new InsufficientFundsException(insufficientFundsPrompt)
		}
		else if(getAccountOptionSelected() == 'S' && getWithdraw() > getDailyLimit()) {
			System.out.println(maxLimitPrompt);
			valid = false;
		}
		
		if(!valid) {
			setWithdraw(0);
		}
		else {
			setBalance(getBalance() - (float)getWithdraw());
		}
	}

	@Override
	public void deposit() {
		setBalance(getBalance() + (float)getDeposit());
	}
	
	@Override
	public void processUserInput() {
		switch (getTransactionOptionSelected()) {
		case 'B':
			balance();
			break;
		case 'D':
			deposit();
			break;
		case 'W':
			withdraw();
			break;
		default:
			break;
		}
	}
	
	public float validateAndGetInputAmount() throws NumberFormatException
	{    
	    boolean valid = false;
	    float amt = 0.0f;
	    int counter = 0;

	    System.out.println(amountPrompt);

	    do
	    {
        	if(counter > 3) {
        		break;
        	}
        	if(counter > 1)
        		System.out.println(amountPrompt);
	        try 
	        {
	            amt = Float.parseFloat(scan.nextLine());
	            valid = true;
	        }
	        catch (NumberFormatException e)
	        {
	        	counter++;
	        }
	    } while(!valid);

	    if(!valid) {
	    	throw new NumberFormatException(maxAttemptPrompt);
	    }
	    
	    return amt;
	}	


	/*
	 * setters and getters
	 */
	
	public float getBalance() {
		return balance;
	}

	public void setBalance(float balance) {
		this.balance = balance;
	}

	public int getWithdraw() {
		return withdraw;
	}

	public void setWithdraw(int withdraw) {
		this.withdraw = withdraw;
	}

	public int getDeposit() {
		return deposit;
	}

	public void setDeposit(int deposit) {
		this.deposit = deposit;
	}

	public char getAccountOptionSelected() {
		return accountOptionSelected;
	}

	public void setAccountOptionSelected(char accountOptionSelected) {
		this.accountOptionSelected = accountOptionSelected;
	}

	public char getTransactionOptionSelected() {
		return transactionOptionSelected;
	}

	public void setTransactionOptionSelected(char transactionOptionSelected) {
		this.transactionOptionSelected = transactionOptionSelected;
	}

	public float getInitialBalance() {
		return initialBalance;
	}

	public void setInitialBalance(float initialBalance) {
		this.initialBalance = initialBalance;
	}
	
	public float getDailyLimit() {
		return dailyLimit;
	}
	public void setDailyLimit(float dailyLimit) {
		this.dailyLimit = dailyLimit;
	}	
	
}

class InsufficientFundsException extends RuntimeException{
	public InsufficientFundsException(String s) {
		super(s);
	}
}
