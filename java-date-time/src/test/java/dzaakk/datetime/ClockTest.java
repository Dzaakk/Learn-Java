package dzaakk.datetime;

import java.time.Clock;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.MonthDay;
import java.time.OffsetDateTime;
import java.time.OffsetTime;
import java.time.Year;
import java.time.YearMonth;
import java.time.ZoneId;
import java.time.ZonedDateTime;

import org.junit.jupiter.api.Test;

public class ClockTest {

    @Test
    void create() {
        Clock clock1 = Clock.systemUTC();
        System.out.println(clock1);

        Clock clock2 = Clock.systemDefaultZone();
        System.out.println(clock2);
    }

    @Test
    void instant() throws Throwable {
        Clock clock = Clock.system(ZoneId.of("Asia/Jakarta"));

        Instant instant1 = clock.instant();
        System.out.println(instant1);

        Thread.sleep(1_000);

        Instant instant2 = clock.instant();
        System.out.println(instant2);
    }

    @Test
    void fromClock() {

        Clock clock = Clock.system(ZoneId.of("Asia/Jakarta"));

        System.out.println(Year.now());

        System.out.println(YearMonth.now(clock));
        System.out.println(MonthDay.now(clock));
        System.out.println(LocalTime.now(clock));
        System.out.println(LocalDateTime.now(clock));
        System.out.println(OffsetTime.now(clock));
        System.out.println(OffsetDateTime.now(clock));
        System.out.println(ZonedDateTime.now(clock));
    }
}
