package account.domain;

public class Account {
    private double amount;

    public Account() {}

    public Account(double amount) {
        this.amount = amount;
    }

    public void setAmmount(double amount) {
        this.amount = amount;
    }

    public double getAmmount() {
        return amount;
    }

    public void update(Account updatedAccount) {
        this.amount = updatedAccount.amount;
    }
}
