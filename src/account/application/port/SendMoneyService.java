package account.application.port;

import account.application.port.in.SendMoneyUseCase;
import account.application.port.out.LoadAccountPort;
import account.application.port.out.UpdateAccountPort;
import account.domain.Account;

public class SendMoneyService implements SendMoneyUseCase {

    private LoadAccountPort loadAccountPort;
    private UpdateAccountPort updateAccountPort;

    public void sendMoney(long accountId, Account updatedAccount) {
        var oldAccount = loadAccountPort.loadAccount(accountId);

        updateAccountPort.updateAccount(oldAccount, updatedAccount);
    }
}
