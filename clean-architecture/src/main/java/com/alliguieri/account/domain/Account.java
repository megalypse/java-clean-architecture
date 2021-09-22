package com.alliguieri.account.domain;

public class Account {
    private double amount;

    public Account() {}

    public Account(double amount) {
        this.amount = amount;
    }

    public void addAmount(double amount) {
        this.amount += amount;
    }

    public boolean withdraw(double amount, Account targetAccount) {
        boolean canWithdraw = canWithdraw(amount);

        if (canWithdraw) {
            this.amount -= amount;
            targetAccount.addAmount(amount);
        }

        return canWithdraw;
    }

    private boolean canWithdraw(double amount) {
        return (this.amount - amount) >= 0;
    }
}
