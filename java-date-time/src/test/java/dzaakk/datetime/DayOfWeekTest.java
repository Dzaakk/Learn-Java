package dzaakk.datetime;

import java.time.DayOfWeek;

import org.junit.jupiter.api.Test;

public class DayOfWeekTest {
    @Test
    void create() {
        DayOfWeek dayOfWeek1 = DayOfWeek.SUNDAY;
        DayOfWeek dayOfWeek2 = dayOfWeek1.plus(2);
        DayOfWeek dayOfWeek3 = dayOfWeek1.minus(1);

        System.out.println(dayOfWeek1);
        System.out.println(dayOfWeek2);
        System.out.println(dayOfWeek3);

    }
}
