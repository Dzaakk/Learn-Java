package dzaakk.stream;

import java.util.List;

import org.junit.jupiter.api.Test;

public class FilteringOperationTest {
    @Test
    void testFilter() {
        List.of(1, 2, 3, 4, 5, 6, 7).stream()
                .filter(number -> number % 2 == 1)
                .forEach(System.out::println);
    }

    @Test
    void testDistinct() {
        List.of(1, 2, 1, 3, 4, 6, 7, 5, 5, 6, 7).stream()
                .distinct()
                .forEach(System.out::println);
    }
}
