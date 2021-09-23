package com.alliguieri.account.application.port.out;

import com.alliguieri.account.adapters.out.AccountPersistanceAdapter;
import com.alliguieri.account.domain.Account;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class UpdateAccountPortTest {

    private final UpdateAccountPort updateAccountPort;

    UpdateAccountPortTest() {
        updateAccountPort = new AccountPersistanceAdapter();
    }

    @Test
    public void shouldWithdrawAmountFromAccount() {
        var oldAccount = new Account(1, 100);
        var updatedAccount = new Account(2, 100);

        updateAccountPort.updateAccount(oldAccount, updatedAccount);

        Assertions.assertEquals(50, oldAccount.getAmount());
        Assertions.assertEquals(150, updatedAccount.getAmount());
    }

}
