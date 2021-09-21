package account.application.port.out;

import account.domain.Account;

public interface LoadAccountPort {

    public Account loadAccount(long accountId);

}
