package tests.entities;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import entities.Account;
import tests.factory.AccountFactory;

public class AccountTests {
	
	@Test
	public void depositShouldIncreaseBalanceAndDiscoundFeeWhenPositiveAmount() {

		double amount = 200.0;
		double expectedValue = 196.0;
		Account acc = AccountFactory.createEmptyAccount();
		
		acc.deposit(amount);
		
		Assertions.assertEquals(expectedValue, acc.getBalance());
		
	}
	
	@Test
	public void depositShouldNothingWhenNegativeAmount() {
		
		double expectedValue = 100.0;
		Account acc = AccountFactory.createAccount(expectedValue);
		double amount = -200.0;
		
		acc.deposit(amount);
		
		Assertions.assertEquals(expectedValue, acc.getBalance());		
	}
	
	@Test
	public void fullWithDrawShouldClearBalance() {
		
		double initialBalance = 800.0;
		Account acc = AccountFactory.createAccount(initialBalance);
		double expectedValue = 0.0;
		
		double result = acc.fullWithdraw();
		
		Assertions.assertTrue(acc.getBalance() == expectedValue);
		Assertions.assertTrue(result == initialBalance);
		
	}
	

}
