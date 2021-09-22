package account.adapters.out;

import account.application.port.out.LoadAccountPort;
import account.application.port.out.UpdateAccountPort;
import account.domain.Account;

public class AccountPersistanceAdapter implements LoadAccountPort, UpdateAccountPort {
    
    public Account loadAccount(long accountId) {
        return new Account(100);
    }

    public void updateAccount(Account oldAccount, Account newAccount) {
        newAccount.withdraw(50, newAccount);
    }

}
