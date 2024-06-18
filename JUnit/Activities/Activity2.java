package demo;

import org.junit.Test;
import static org.junit.jupiter.api.Assertions.*;
import static org.junit.Assert.assertThrows;
import demo.BankAccount;
import demo.NotEnoughFundsException;

public class Activity2 {
	
	@Test
	public void notEnoughFunds() {
		BankAccount account = new BankAccount(9);
		assertThrows(NotEnoughFundsException.class,() -> account.withdraw(10),
								"Balance must be greater than amount of withdrawal");
	}
 @Test
 public void enoughFunds() {
	 BankAccount account = new BankAccount(200);
		assertDoesNotThrow(() -> account.withdraw(100));
 }
}
