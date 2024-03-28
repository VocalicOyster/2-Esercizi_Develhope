import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;

public class Es_Offset5 {
    public static void main(String[] args) {
        OffsetDateTime data1 = OffsetDateTime.parse("2023-03-01T13:00:00Z");
        OffsetDateTime data2 = OffsetDateTime.parse("2024-03-01T13:00:00Z");
        System.out.println(data1.isBefore(data2));
        System.out.println(data2.isAfter(data1));

        System.out.println(data1.isEqual(OffsetDateTime.now()));
        System.out.println(data2.isEqual(OffsetDateTime.now()));


    }
}
