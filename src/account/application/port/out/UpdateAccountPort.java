package account.application.port.out;

import account.domain.Account;

public interface UpdateAccountPort {

    public void updateAccount(Account oldAccount, Account newAccount);
    
}
