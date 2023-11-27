import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
public class esercizio31di4 {
    public static void main(String[] args) {
        OffsetDateTime fecha = OffsetDateTime.parse("2023-03-01T13:00:00Z");
        System.out.println(fecha);

        fecha = fecha.plusYears(1);
        System.out.println(fecha);

        fecha = fecha.minusMonths(1);
        System.out.println(fecha);

        fecha = fecha.plusDays(7);
        System.out.println(fecha);

        String fechaString = fecha.format(DateTimeFormatter.ofPattern("dd MMMM yyyy", Locale.ITALY));
        System.out.println(fechaString);
    }
}