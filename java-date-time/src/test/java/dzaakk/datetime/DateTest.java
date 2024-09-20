package dzaakk.datetime;

import java.util.Date;

import org.junit.jupiter.api.Test;

public class DateTest {
    @Test
    void Create() {
        var date1 = new Date();
        var date2 = new Date(System.currentTimeMillis());

        System.out.println(date1);
        System.out.println(date2);

    }
}
