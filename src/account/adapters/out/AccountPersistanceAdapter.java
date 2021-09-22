package account.adapters.out;

import account.application.port.out.LoadAccountPort;
import account.domain.Account;

public class AccountPersistanceAdapter implements LoadAccountPort {
    
    public Account loadAccount(long accountId) {
        return new Account(100);
    }

}
