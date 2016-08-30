package ssa;

public class Checking extends Account {
	
	private static int lastCheckNbr = 100;
	
	double withdraw(double amount) {
		lastCheckNbr++;
		return
			super.withdraw(amount);
		}
 }

