import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class Es_Offset1 {
    public static void main(String[] args) {
        OffsetDateTime offsetDateTime = OffsetDateTime.parse("2002-03-01T13:00:00Z");

        System.out.println(offsetDateTime.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL)));
        System.out.println(offsetDateTime.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM)));
        System.out.println(offsetDateTime.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT)));

    }
}
