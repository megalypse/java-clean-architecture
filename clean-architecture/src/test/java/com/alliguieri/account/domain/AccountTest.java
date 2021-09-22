package com.alliguieri.account.domain;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class AccountTest {
    @Test
    public void accountCreationSucceeds() {
        Account account1 = new Account(1, 100);

        assertTrue(account1.getId() == 1);
        assertTrue(account1.getAmount() == 100);
    }
}
