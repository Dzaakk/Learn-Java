package dzaakk.datetime;

import java.util.Calendar;
import java.util.TimeZone;

import org.junit.jupiter.api.Test;

public class TimeZoneTest {

    @Test
    void calendarTimeZone() {
        Calendar calendar1 = Calendar.getInstance(TimeZone.getTimeZone("Asia/Jakarta"));
        Calendar calendar2 = Calendar.getInstance(TimeZone.getTimeZone("GMT"));

        System.out.println(calendar1.get(Calendar.HOUR_OF_DAY));
        System.out.println(calendar2.get(Calendar.HOUR_OF_DAY));

    }
}
