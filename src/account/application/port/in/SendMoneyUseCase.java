package account.application.port.in;

import account.domain.Account;

public interface SendMoneyUseCase {
    public boolean sendMoney(long accountId, Account updatedAccount);
}
