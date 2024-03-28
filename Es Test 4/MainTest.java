import org.junit.jupiter.api.Test;

import java.time.Month;
import java.time.OffsetDateTime;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {
    Main main = new Main();
    @Test
    void getYear() {
        int res = main.getYear(OffsetDateTime.parse("2023-03-01T13:00:00Z"));

        assertEquals(2023, res);
    }

    @Test
    void getMonth() {
        Month res = main.getMonth(OffsetDateTime.parse("2023-03-01T13:00:00Z"));
        assertEquals(Month.MARCH, res);
    }
}