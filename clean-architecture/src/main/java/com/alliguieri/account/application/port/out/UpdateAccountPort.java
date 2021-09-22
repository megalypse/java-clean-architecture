package com.alliguieri.account.application.port.out;

import com.alliguieri.account.domain.Account;

public interface UpdateAccountPort {

    public void updateAccount(Account oldAccount, Account newAccount);
    
}
