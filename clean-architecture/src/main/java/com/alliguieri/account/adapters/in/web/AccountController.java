package com.alliguieri.account.adapters.in.web;

import com.alliguieri.account.application.port.in.SendMoneyUseCase;
import com.alliguieri.account.domain.Account;
import com.alliguieri.common.contracts.BaseController;

public class AccountController implements BaseController {
    private SendMoneyUseCase sendMoneyUseCase;

    public AccountController(SendMoneyUseCase sendMoneyUseCase) {
        this.sendMoneyUseCase = sendMoneyUseCase;
    }

    public void sendMoneyHandler(long accountId, Account updatedAccount) {
        sendMoneyUseCase.sendMoney(accountId, updatedAccount);
    }

    public void handleContext(String context, Object... data) {
        switch(context) {
            case "/send-money":
                sendMoneyHandler((long)data[0], (Account)data[1]);
                break;
            default:
                throw new RuntimeException("Context not found");
        }
    }
}
