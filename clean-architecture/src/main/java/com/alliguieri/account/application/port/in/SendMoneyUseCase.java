package com.alliguieri.account.application.port.in;

import com.alliguieri.account.domain.Account;

public interface SendMoneyUseCase {
    public boolean sendMoney(long accountId, Account updatedAccount);
}
