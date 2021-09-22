package com.alliguieri.account.domain;

import lombok.Getter;

@Getter
public class Account {
    private long id;
    private double amount;

    public long getId() {
        return id;
    }

    public double getAmount() {
        return amount;
    }

    public Account() {}

    public Account(long id, double amount) {
        this.id = id;
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
