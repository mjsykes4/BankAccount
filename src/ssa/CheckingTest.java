package ssa;

import static org.junit.Assert.*;

import org.junit.Test;

public class CheckingTest {

	@Test
	public void testWithdraw() {
		Account myNewAccount = new Account();
		myNewAccount.setBalance(200);
		assertEquals(100,myNewAccount.withdraw(100),0);
	}

}
