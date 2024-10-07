package test.java.com.bank;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BankAccountTest {

    @Test
    public void testDeposit() {
        BankAccount account = new BankAccount("123");
        account.deposit(100.0);
        assertEquals(100.0, account.getBalance());
    }

    @Test
    public void testWithdraw() {
        BankAccount account = new BankAccount("123");
        account.deposit(200.0);
        assertTrue(account.withdraw(100.0));
        assertEquals(100.0, account.getBalance());
    }

    @Test
    public void testTransfer() {
        BankAccount account1 = new BankAccount("123");
        BankAccount account2 = new BankAccount("456");
        account1.deposit(200.0);

        AccountService service = new AccountService();
        assertTrue(service.transfer(account1, account2, 100.0));
        assertEquals(100.0, account1.getBalance());
        assertEquals(100.0, account2.getBalance());
    }
}
