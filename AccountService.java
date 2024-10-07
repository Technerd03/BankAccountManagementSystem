package main.java.com.bank;

public class AccountService {
    public boolean transfer(BankAccount from, BankAccount to, double amount) {
        if (from.withdraw(amount)) {
            to.deposit(amount);
            return true;
        }
        return false;
    }
}