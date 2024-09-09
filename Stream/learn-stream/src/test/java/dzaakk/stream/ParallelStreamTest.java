package dzaakk.stream;

import java.util.stream.Stream;

import org.junit.jupiter.api.Test;

public class ParallelStreamTest {

    @Test
    void testSequential() {

        Stream.of(1, 2, 3, 4, 5, 6, 7)
                .forEach(number -> System.out.println(Thread.currentThread().getName() + " : " + number));
    }

    @Test
    void testParallel() {

        Stream.of(1, 2, 3, 4, 5, 6, 7)
                .parallel()
                .forEach(number -> System.out.println(Thread.currentThread().getName() + " : " + number));
    }
}
