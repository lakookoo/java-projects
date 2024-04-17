package accounts;

public class SavingsAccount extends Account{
    public SavingsAccount(double balance, double interestRate) {
        super(balance, interestRate);
    }

    @Override
    public boolean withdraw(double amount) {
        double fee = 0.025 * amount;
        amount += fee;

        if(amount > balance){
            return false;
        }
        balance -= amount;
        return true;
    }
}
