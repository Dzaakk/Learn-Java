package dzaakk.datetime;

import java.time.LocalDate;
import java.time.Period;

import org.junit.jupiter.api.Test;

public class PeriodTest {
    @Test
    void create() {
        Period period1 = Period.ofDays(10);
        Period period2 = Period.ofWeeks(10);
        Period period3 = Period.ofMonths(10);
        Period period4 = Period.ofYears(10);
        Period period5 = Period.of(2024, 9, 26);

        System.out.println(period1);
        System.out.println(period2);
        System.out.println(period3);
        System.out.println(period4);
        System.out.println(period5);
    }

    @Test
    void get() {
        Period period = Period.of(2024, 9, 26);

        System.out.println(period.getYears());
        System.out.println(period.getMonths());
        System.out.println(period.getDays());
    }

    @Test
    void between() {
        Period period = Period.between(
                LocalDate.of(2020, 9, 26),
                LocalDate.now());

        System.out.println(period.getYears());
        System.out.println(period.getMonths());
        System.out.println(period.getDays());
    }
}
