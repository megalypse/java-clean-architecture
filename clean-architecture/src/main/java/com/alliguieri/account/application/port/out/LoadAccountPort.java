package com.alliguieri.account.application.port.out;

import com.alliguieri.account.domain.Account;

public interface LoadAccountPort {

    public Account loadAccount(long accountId);

}
