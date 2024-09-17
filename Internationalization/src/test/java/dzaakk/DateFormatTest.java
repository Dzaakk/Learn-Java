package dzaakk;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

import org.junit.jupiter.api.Test;

public class DateFormatTest {
    @Test
    void testDateFormat() {
        var pattern = "EEEE dd MMMM YY";
        var dateFormat = new SimpleDateFormat(pattern);

        var format = dateFormat.format(new Date());
        System.out.println(format);
    }

    @Test
    void testDateFormatIndonesia() {
        var pattern = "EEEE dd MMMM YY";
        var indonesia = new Locale("in", "ID");
        var dateFormat = new SimpleDateFormat(pattern, indonesia);

        var format = dateFormat.format(new Date());
        System.out.println(format);
    }

    @Test
    void testDateFormatParseIndonesia() {
        var pattern = "EEEE dd MMMM YYYY";
        var indonesia = new Locale("in", "ID");
        var dateFormat = new SimpleDateFormat(pattern, indonesia);

        try {
            var date = dateFormat.parse("Selasa 17 September 24");
            System.out.println(date);
        } catch (ParseException e) {
            System.out.println("Error parse : " + e.getMessage());
        }
    }
}
