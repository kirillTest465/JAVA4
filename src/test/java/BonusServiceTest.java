import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class BonusServiceTest {

    @Test
    void shouldCalculateForRegisteredAndUnderLimit() {
        BonusService service = new BonusService();

        // подготавливаем данные:
        long amount = 1000;
        boolean registered = true;
        long expected = 30;

        // вызываем целевой метод:
        long actual = service.calculate(amount, registered);

        // производим проверку (сравниваем ожидаемый и фактический):
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void shouldCalculateForRegisteredAndOverLimit() {
        BonusService service = new BonusService();

        // подготавливаем данные:
        long amount = 1_000_000;
        boolean registered = true;
        long expected = 500;

        // вызываем целевой метод:
        long actual = service.calculate(amount, registered);

        // производим проверку (сравниваем ожидаемый и фактический):
        Assertions.assertEquals(expected, actual);
    }

    @Test
     void shouldCalculateForRegisteredAndUnderLimitFalse () {
        BonusService service = new BonusService();

        // подготавливаем данные:
        long amount = 1000;
        boolean registered = false;
        long expested = 10;

        // вызываем целевой метод:
        long actual = service.calculate(amount, registered);

        // производим проверку (сравниваем ожидаемый и фактический результат):
        Assertions.assertEquals(expested, actual);
        }

        @Test
        void shouldCalculateForRegisteredAndOverLimitFalse () {
            BonusService service = new BonusService();

            // подготавливаем данные:
            long amount = 1000000;
            boolean registered = false;
            long expested = 500;

            // вызываем целевой метод:
            long actual = service.calculate(amount, registered);

            //производим проверку (сравниваем ожидаемый и факьичесий результат):
            Assertions.assertEquals(expested, actual);
        }
    }
