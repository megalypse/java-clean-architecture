package account.application.port.in;

public class SendMoneyDto {
    
    private final long sourceAccountId;
    private final long targetAccountId;

    public SendMoneyDto(
        long sourceAccountId,
        long targetAccountId
    ) {
        this.sourceAccountId = sourceAccountId;
        this.targetAccountId = targetAccountId;
    }

}
