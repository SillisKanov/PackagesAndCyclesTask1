import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class ServiceTest {

    @Test
    void calculateWeekend() {
        int expected = 3;
        int result = new Service(10000, 3000, 20000).calculate();
        Assertions.assertEquals(expected, result);
    }

//    @Test
//    void shouldCalculateForRegisteredAndOverLimit() {
//        BonusService service = new BonusService();
//
//        // подготавливаем данные:
//        long amount = 1_000_000;
//        boolean registered = true;
//        long expected = 500;
//
//        // вызываем целевой метод:
//        long actual = service.calculate(amount, registered);
//
//        // производим проверку (сравниваем ожидаемый и фактический):
//        Assertions.assertEquals(expected, actual);
//    }
}
