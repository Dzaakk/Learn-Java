package dzaakk.datetime;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

import org.junit.jupiter.api.Test;

public class DateFormatterTest {
    @Test
    void parsing() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy MM dd");

        LocalDate localDate = LocalDate.parse("2024 09 27", formatter);
        System.out.println(localDate);
    }

    @Test
    void format() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy MM dd");

        LocalDate localDate = LocalDate.parse("2024 09 27", formatter);

        String format = localDate.format(formatter);
        System.out.println(format);
    }

    @Test
    void defaultFormatter() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy MM dd");

        LocalDate localDate = LocalDate.parse("2024 09 27", formatter);
        String format = localDate.format(DateTimeFormatter.ISO_LOCAL_DATE);

        System.out.println(format);
    }

    @Test
    void i18n() {
        Locale locale = new Locale("en", "US");
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy MM dd", locale);

        LocalDate localDate = LocalDate.now();
        String format = localDate.format(formatter);

        System.out.println(format);
    }
}
