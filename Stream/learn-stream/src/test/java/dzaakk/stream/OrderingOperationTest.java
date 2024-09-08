package dzaakk.stream;

import java.util.Comparator;
import java.util.List;

import org.junit.jupiter.api.Test;

public class OrderingOperationTest {

    @Test
    void testSorted() {
        List.of("A", "B", "C", "D").stream()
                .sorted()
                .forEach(System.out::println);
    }

    @Test
    void testSortedWithComparator() {
        Comparator<String> reverseComparator = Comparator.reverseOrder();

        List.of("A", "B", "C", "D").stream()
                .sorted(reverseComparator)
                .forEach(System.out::println);
    }

}
