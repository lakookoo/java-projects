import accounts.Account;
import accounts.CheckingAccount;
import accounts.SavingsAccount;

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

        CheckingAccount checkingAccount = new CheckingAccount(300, 0.03, 400);
        checkingAccount.status();
        if (checkingAccount.purchase(18.68)) {
            System.out.println("Purchase successful");
        } else {
            System.out.println("Purchase failed");
        }
        System.out.println(checkingAccount.getRewardPoints());

        CheckingAccount ca = new CheckingAccount(100, 0.037, 500);
        SavingsAccount sa = new SavingsAccount(100, 0.045);

        ca.status();
        sa.status();

        sa.withdraw(10);
        ca.withdraw(10);

        ca.status();
        sa.status();
    }
}