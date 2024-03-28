package Develhope_Ex;

import javax.swing.text.DateFormatter;
import java.time.OffsetDateTime;
import java.time.OffsetTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class Es_Offset2 {
    public static void main(String[] args) {
        OffsetDateTime offsetDateTime = OffsetDateTime.parse("2023-03-01T13:00:00Z");

        System.out.println(offsetDateTime.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG)));
    }
}
