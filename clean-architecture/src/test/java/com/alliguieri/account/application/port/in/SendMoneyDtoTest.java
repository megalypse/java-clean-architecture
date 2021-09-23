package com.alliguieri.account.application.port.in;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SendMoneyDtoTest {
    @Test
    public void shouldCreateDtoSuccessfully() {
        long sourceId = 1;
        long targetId = 2;
        var dto = new SendMoneyDto(sourceId, targetId);

        Assertions.assertEquals(sourceId, dto.getSourceAccountId());
        Assertions.assertEquals(targetId, dto.getTargetAccountId());
    }

    @Test
    public void failsToCreateInstance() {
        Assertions.assertThrows(AssertionError.class, () -> new SendMoneyDto(0, 0));
    }
}
