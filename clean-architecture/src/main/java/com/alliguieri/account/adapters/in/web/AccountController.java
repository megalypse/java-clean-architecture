package account.adapters.in.web;

import account.application.port.in.SendMoneyUseCase;
import account.domain.Account;

public class AccountController {
    private SendMoneyUseCase sendMoneyUseCase;

    public AccountController(SendMoneyUseCase sendMoneyUseCase) {
        this.sendMoneyUseCase = sendMoneyUseCase;
    }

    public void sendMoneyHandler(long accountId, Account updatedAccount) {
        sendMoneyUseCase.sendMoney(accountId, updatedAccount);
    }
}
