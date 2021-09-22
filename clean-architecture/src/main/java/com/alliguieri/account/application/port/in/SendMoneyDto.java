package com.alliguieri.account.application.port.in;

public class SendMoneyDto {
    
    private final long sourceAccountId;
    private final long targetAccountId;

    public SendMoneyDto(
        long sourceAccountId,
        long targetAccountId
    ) {
        assert sourceAccountId > 0;
        assert targetAccountId > 0;

        this.sourceAccountId = sourceAccountId;
        this.targetAccountId = targetAccountId;
    }

    public long getSourceAccountId() {
        return sourceAccountId;
    }

    public long getTargetAccountId() {
        return targetAccountId;
    }

}
