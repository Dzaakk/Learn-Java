package dzaakk.datetime;

import java.util.Calendar;
import java.util.Date;

import org.junit.jupiter.api.Test;

public class CalendarTest {
    @Test
    void modifyCalendar() {
        Calendar calendar = Calendar.getInstance();

        calendar.set(Calendar.YEAR, 2000);
        calendar.set(Calendar.MONTH, Calendar.JANUARY);
        calendar.set(Calendar.DAY_OF_MONTH, 1);

        Date date = calendar.getTime();

        System.out.println(date);
    }

    @Test
    void getCalendar() {
        Calendar calendar = Calendar.getInstance();

        System.out.println(calendar.get(Calendar.YEAR));
        System.out.println(calendar.get(Calendar.MONTH));
        System.out.println(calendar.get(Calendar.DAY_OF_MONTH));
    }
}
