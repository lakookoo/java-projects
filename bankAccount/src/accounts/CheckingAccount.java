package accounts;

public class CheckingAccount extends Account {
    public int rewardPoints;
    public CheckingAccount(double balance, double interestRate, int rewardPoints) {
        super(balance, interestRate);
        this.rewardPoints = rewardPoints;
    }

    public int getRewardPoints() {
        return rewardPoints;
    }

    public boolean purchase(double cost) {
        if (cost > balance) {
            return  false;
        }

        balance -= cost;
        rewardPoints += (int) (cost * 10);
        return true;
    }
}
