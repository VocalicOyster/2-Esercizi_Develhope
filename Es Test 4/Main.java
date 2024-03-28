import java.time.Month;
import java.time.OffsetDateTime;

public class Main {
    public static void main(String[] args) {
        OffsetDateTime data = OffsetDateTime.parse("2023-03-01T13:00:00Z");
        System.out.println(data.getYear());
        System.out.println(data.getMonth());
        System.out.println(data.getDayOfMonth());
        System.out.println(data.getDayOfWeek());
    }

    public int getYear(OffsetDateTime data) {
        return data.getYear();
    }

    public Month getMonth(OffsetDateTime data) {
        return data.getMonth();
    }
}
