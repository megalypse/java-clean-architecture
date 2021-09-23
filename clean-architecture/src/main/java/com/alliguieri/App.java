package com.alliguieri;

import java.util.List;

import com.alliguieri.account.adapters.in.web.AccountController;
import com.alliguieri.account.adapters.out.AccountPersistanceAdapter;
import com.alliguieri.account.application.SendMoneyService;
import com.alliguieri.account.domain.Account;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        var accountPersistanceAdapter = new AccountPersistanceAdapter();
        var sendMoneyService = new SendMoneyService(accountPersistanceAdapter, accountPersistanceAdapter);
        var accountController = new AccountController(sendMoneyService);
        var router = new Router(accountController);

        // on request
        router.handleRoute("/account", 1, new Account(2, 50));
    }
}
