package account.application.port.in;

import account.domain.Account;

public interface SendMoneyUseCase {
    public void sendMoney(long accountId, Account updatedAccount);
}
