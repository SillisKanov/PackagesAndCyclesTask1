package ru.netology.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ServiceTest {

    @Test
    void calculateWeekend() {
        int expected = 3;
        int result = new Service(10000, 3000, 20000).calculate();
        Assertions.assertEquals(expected, result);
    }
}
