package model;

public class BankAccount {
	private int amount;
	private int accountNumber;
	private String accountHolderName;
	public static int lastAccountNumber;
	
	public BankAccount(){
		lastAccountNumber ++;
		accountNumber = lastAccountNumber;
		System.out.println("");
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}
	
	public void calcuateAPR(){
		int apr = (amount % 12) *(100);
	}
	
	public int getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}

	public int getLastAccountNumber() {
		return lastAccountNumber;
	}

	public void setLastAccountNumber(int lastAccountNumber) {
		this.lastAccountNumber = lastAccountNumber;
	}
	public String getAccountHolderName() {
		return accountHolderName;
	}

	public void setAccountHolderName(String accountHolderName) {
		this.accountHolderName = accountHolderName;
	}
	
}
