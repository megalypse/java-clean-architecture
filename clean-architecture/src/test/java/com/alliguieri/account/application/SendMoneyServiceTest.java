package com.alliguieri.account.application;

import static org.junit.Assert.assertTrue;

import com.alliguieri.account.adapters.out.AccountPersistanceAdapter;
import com.alliguieri.account.application.port.in.SendMoneyUseCase;
import com.alliguieri.account.domain.Account;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class SendMoneyServiceTest {

    private SendMoneyUseCase sendMoneyUseCase;
    private AccountPersistanceAdapter accountPersistanceAdapter;

    @BeforeEach
    void setUp() {
        accountPersistanceAdapter = new AccountPersistanceAdapter();
        sendMoneyUseCase = new SendMoneyService(accountPersistanceAdapter, accountPersistanceAdapter);
    }

    @Test
    public void testSendMoney() {
        Account updatedAccount = accountPersistanceAdapter.loadAccount(1);
        boolean result = sendMoneyUseCase.sendMoney(1, updatedAccount);

        assertTrue(result);
    }

}
