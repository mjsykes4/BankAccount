package ssa;

public class Mainline {
	
	public static void main(String[] args) {
		Account Checking = new Account();
		Checking.accountId = 100;
		Checking.description = "My personal checking";
		Checking.balance = 500;
		System.out.println(Checking.description + "..." + Checking.balance);
		System.out.println("+ $200 deposit");
		System.out.println(Checking.description + "..." +  Checking.deposit(200));
		System.out.println("-$600 withdrawal");
		System.out.println(Checking.description + "..." + Checking.withdrawal(600));
		Checking.deposit(100);
		System.out.println("+ $100 deposit");
		System.out.println(Checking.description + "..." + Checking.withdrawal(300));
		System.out.println(Checking.description + "..." + Checking.withdrawal(200));
		
		//start of savings account		
		Account Savings = new Account();
		Savings.accountId = 200;
		Savings.description = "My personal savings";
		Savings.balance = 1000;
		System.out.println(Savings.description + "..." + Savings.balance);
		System.out.println(Savings.description + "..." + Savings.withdrawal(750));
		System.out.println("-$750 withdrawal");
		System.out.println(Savings.description + "..." + Savings.withdrawal(250));
		System.out.println("-$250 withdrawal");
		System.out.println(Savings.description + "..." +  Savings.deposit(200));
		System.out.println("+ $200 deposit");
		
		System.out.printf(Checking.description + "..." + Checking.balance + " " + Savings.description + "..." + Savings.balance);
	}
}
