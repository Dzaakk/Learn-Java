package dzaakk.stream;

import java.util.List;
import java.util.stream.Stream;

import org.junit.jupiter.api.Test;

public class StreamOperationTest {
    @Test
    void testStreamOperation() {
        List<String> names = List.of("data1", "data2", "data3");

        Stream<String> streamNames = names.stream();
        Stream<String> streamUpper = streamNames.map(name -> name.toUpperCase());

        streamUpper.forEach(System.out::println);
        names.forEach(System.out::println);

    }
}
