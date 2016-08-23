package ssa;

public class Account5 {

	int accountId;
	String description;
	double balance;
	double amount;

	
	void accountDetails(String aDescription) {
		description = aDescription;
	}
	double deposit(double amount) {
		balance += amount;
		return (balance); 
	}

	double withdrawal(double amount) {
		if(amount > balance) {
		System.out.printf("You attempted to withdrawal " + amount );
		System.out.println("Insufficient funds to complete transaction");
		return balance;
		} else {
		balance -= amount;
		return (balance);
		}
	}
}

	
			
