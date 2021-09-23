package com.alliguieri.account.application.port.out;

import com.alliguieri.account.adapters.out.AccountPersistanceAdapter;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LoadAccountPortTest {
    private final LoadAccountPort loadAccountPort;

    LoadAccountPortTest() {
        loadAccountPort = new AccountPersistanceAdapter();
    }

    @Test
    public void successfullyLoadsAnAccount() {
        var accountId = 1L;
        var account = loadAccountPort.loadAccount(accountId);

        Assertions.assertEquals(accountId, account.getId());
    }
}
