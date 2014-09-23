package modelCallers;

import model.BankAccount;

public class BankAccountCaller {
	
	public static void main (String args[]){
		//initializes a new BankAccount array with length of 10
		BankAccount[] bankAccounts = new BankAccount[10];		
		
		//create 10 bank account objects and store them in array created above.
		for(int i=1; i<=10; i++){
			//create the object
			BankAccount ba = new BankAccount();
			//Below 2 lines are getting executed from teh constructor now:::
			//lastAccountNumber ++;
			//accountNumber = lastAccountNumber;
			//sets the account holder name
			ba.setAccountHolderName("holder"+i);
			System.out.println("last account number created : "+BankAccount.lastAccountNumber);
			//Sets the object to array.
			bankAccounts[i-1] = ba;
		}
		
		//We have created the bank account objects, now read them out
		for(BankAccount bankAccount : bankAccounts){
			System.out.println("Holder name : "+bankAccount.getAccountHolderName()+
					" - account number is "+bankAccount.getAccountNumber());
		}
	}
}
