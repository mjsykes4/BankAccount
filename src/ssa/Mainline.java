package ssa;

public class Mainline {
	
	public static void main(String[] args) {

		Savings savings = new Savings();
		savings.deposit(500);
		savings.setInterestRate(.015);
		savings.calcDepositInterest(4);
				
		System.out.println(savings.print());
	}
}
