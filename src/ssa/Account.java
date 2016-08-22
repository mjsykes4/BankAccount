package ssa;

public class Account {

	int accountId;
	String description;
	int balance;
	int amount;
	
	void accountDetails(String aDescription) {
		description = aDescription;
	}
	int deposit(int amount) {
		balance += amount;
		return (balance); 
	}

	int withdrawal(int amount) {
		if(amount > balance) {
		System.out.println("Insufficient funds");
		return balance;
		} else {
		balance -= amount;
		return (balance);
		}
	}
}

		
			
