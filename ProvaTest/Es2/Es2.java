package Es2;

import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class Es2 {
    public static void main(String[] args) {
        OffsetDateTime data = OffsetDateTime.parse("2002-03-01T13:00:00Z");

        String data1 = data.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL));
        String data2 = data.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM));
        String data3 = data.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT));
    }


    public int addYears(int y) {
        OffsetDateTime data1 = OffsetDateTime.parse("2002-03-01T13:00:00Z");
        data1 = data1.plusYears(1);
        return data1.getYear();
    }
}


