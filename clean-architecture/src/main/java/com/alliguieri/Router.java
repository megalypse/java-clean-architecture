package com.alliguieri;

import com.alliguieri.account.adapters.in.web.AccountController;

public class Router {
    private AccountController accountController;

    public Router(
        AccountController accountController
    ) {
        this.accountController = accountController;
    }

    public void handleRoute(String route, Object... data) {
        switch(route) {
            case "/account":
                accountController.handleContext(route, data);
                break;
            default:
                throw new RuntimeException("Route not found");
        }
    }
}
