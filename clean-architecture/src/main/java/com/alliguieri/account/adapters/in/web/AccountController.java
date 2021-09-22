package com.alliguieri.account.adapters.in.web;

import com.alliguieri.account.application.port.in.SendMoneyUseCase;
import com.alliguieri.account.domain.Account;

public class AccountController {
    private SendMoneyUseCase sendMoneyUseCase;

    public AccountController(SendMoneyUseCase sendMoneyUseCase) {
        this.sendMoneyUseCase = sendMoneyUseCase;
    }

    public void sendMoneyHandler(long accountId, Account updatedAccount) {
        sendMoneyUseCase.sendMoney(accountId, updatedAccount);
    }
}
