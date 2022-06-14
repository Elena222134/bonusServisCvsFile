package org.example.bonusServisCvsFile.bonus;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BonusServiceTest {
    @ParameterizedTest

    @CsvFileSource(resources = "/data.csv")

    public void shouldCalculateForRegisteredAndUnderLimit(long expected, long amount, long limit, boolean registered) {
        BonusService service = new BonusService();


        long actual;
        actual = service.calculate(amount, limit, registered);


        Assertions.assertEquals(expected, actual);
    }

}
