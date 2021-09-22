package com.alliguieri.account.application;

import com.alliguieri.account.application.port.in.SendMoneyUseCase;
import com.alliguieri.account.application.port.out.LoadAccountPort;
import com.alliguieri.account.application.port.out.UpdateAccountPort;
import com.alliguieri.account.domain.Account;

public class SendMoneyService implements SendMoneyUseCase {
    private final LoadAccountPort loadAccountPort;
    private final UpdateAccountPort updateAccountPort;

    public SendMoneyService(LoadAccountPort loadAccountPort, UpdateAccountPort updateAccountPort) {
        this.loadAccountPort = loadAccountPort;
        this.updateAccountPort = updateAccountPort;
    }

    @Override
    public boolean sendMoney(long accountId, Account updatedAccount) {
        Account oldAccount = loadAccountPort.loadAccount(accountId);

        updateAccountPort.updateAccount(oldAccount, updatedAccount);

        return true;
    }
}
