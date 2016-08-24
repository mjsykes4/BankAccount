package ssa;

public class Savings extends Account {
	private double InterestRate;

	public double getInterestRate() {
		return InterestRate;
	}

	public void setInterestRate(double interestRate) {
		if(interestRate > 0) {
		InterestRate = interestRate;
		}
	}
	
	public double calcDepositInterest(int months) {
		double newInterest = ((getBalance() * InterestRate * months)/12);
		if(months > 0) {
		super.deposit(newInterest);
		return newInterest;
		} else {
		return 0;
		}
	}

}
