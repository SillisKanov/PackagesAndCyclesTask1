package ru.netology.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

public class ServiceTest {

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/values.csv")
    void calculateWeekend(int expected, int income, int expenses, int threshold) {
        Assertions.assertEquals(expected, Service.calculate(income, expenses, threshold));
    }
}
