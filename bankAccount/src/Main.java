import accounts.Account;
import accounts.CheckingAccount;

public class Main {
    public static void main(String[] args) {
        Account account = new Account(100, 0.025);
        account.status();
        account.withdraw(45.45);
        account.status();
        account.withdraw(62.98);
        account.status();
        account.deposit(32.34);
        account.status();

        CheckingAccount checkingAccount = new CheckingAccount(300, 0.03);
        checkingAccount.status();
    }
}