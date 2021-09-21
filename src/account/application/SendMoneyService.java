package account.application;

import account.application.port.in.SendMoneyUseCase;
import account.application.port.out.LoadAccountPort;
import account.application.port.out.UpdateAccountPort;
import account.domain.Account;

public class SendMoneyService implements SendMoneyUseCase {
    private final LoadAccountPort loadAccountPort;
    private final UpdateAccountPort updateAccountPort;

    public SendMoneyService(LoadAccountPort loadAccountPort, UpdateAccountPort updateAccountPort) {
        this.loadAccountPort = loadAccountPort;
        this.updateAccountPort = updateAccountPort;
    }

    @Override
    public boolean sendMoney(long accountId, Account updatedAccount) {
        var oldAccount = loadAccountPort.loadAccount(accountId);

        updateAccountPort.updateAccount(oldAccount, updatedAccount);

        return true;
    }
}
