package Develhope_Ex;

import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class Es_Offset4 {
    public static void main(String[] args) {
        OffsetDateTime data = OffsetDateTime.parse("2023-03-01T13:00:00Z");
        data = data.plusYears(1);
        data = data.minusMonths(1);
        data = data.plusDays(7);

        String dateTimeFormatter = data.format(DateTimeFormatter.ofPattern("dd/MMMM/yyyy").withLocale(Locale.ITALY));

        System.out.println(dateTimeFormatter);
    }
}
