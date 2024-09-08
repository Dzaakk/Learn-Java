package dzaakk.stream;

import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.Test;

public class RetrievingOperationTest {
    @Test
    void testLimit() {
        List.of(12, 24, 22, 67, 98, 78, 90).stream()
                .limit(2)
                .forEach(System.out::println);
    }

    @Test
    void testSkip() {
        List.of(12, 24, 22, 67, 98, 78, 90).stream()
                .skip(2)
                .forEach(System.out::println);
    }

    @Test
    void testTakeWhile() {
        List.of(12, 24, 22, 67, 98, 78, 90).stream()
                .takeWhile(number -> number < 60) // will stop when data 67
                .forEach(System.out::println);
    }

    @Test
    void testDropWhile() {
        List.of(12, 24, 22, 67, 98, 78, 90).stream()
                .dropWhile(number -> number < 60) // skip until 22 and will retireve data after that
                .forEach(System.out::println);
    }

    @Test
    void testFindAny() {
        Optional<String> optional = List.of("A", "B", "C", "D").stream().findAny();

        optional.ifPresent(name -> {
            System.out.println(name);
        });
    }

    @Test
    void testFindFirst() {
        Optional<String> optional = List.of("A", "B", "C", "D").stream().findFirst();

        optional.ifPresent(name -> {
            System.out.println(name);
        });
    }

}
