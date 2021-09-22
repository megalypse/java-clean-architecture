package com.alliguieri.account.adapters.out;

import com.alliguieri.account.application.port.out.LoadAccountPort;
import com.alliguieri.account.application.port.out.UpdateAccountPort;
import com.alliguieri.account.domain.Account;

public class AccountPersistanceAdapter implements LoadAccountPort, UpdateAccountPort {
    
    public Account loadAccount(long accountId) {
        return new Account(100);
    }

    public void updateAccount(Account oldAccount, Account newAccount) {
        newAccount.withdraw(50, newAccount);
    }

}
