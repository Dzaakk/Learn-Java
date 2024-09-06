package dzaakk.stream;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Stream;

import org.junit.jupiter.api.Test;

public class CreateStreamTest {

    @Test
    void testCreateStream() {
        Stream<String> emptyStream = Stream.empty();
        emptyStream.forEach(data -> System.out.println(data));
        Stream<String> oneStream = Stream.of("data1");
        oneStream.forEach(data -> System.out.println(data));

        String data = null;
        Stream<String> emptyOrNotStream = Stream.ofNullable(data);
        emptyOrNotStream.forEach(item -> System.out.println(item));

    }

    @Test
    void testCreateStreamArray() {
        Stream<String> arrayStream = Stream.of("data1", "data2", "data3");
        arrayStream.forEach(data -> System.out.println(data));
        Stream<Integer> integerStream = Stream.of(1, 2, 3, 4, 5);
        integerStream.forEach(System.out::println);

        String[] array = new String[] {
                "data1", "data2", "data3"
        };
        Stream<String> streamFromArray = Arrays.stream(array);
        streamFromArray.forEach(System.out::println);
    }

    @Test
    void testCreateStreamFromCollection() {
        Collection<String> collection = List.of("data1", "data2", "data3");
        Stream<String> stringStream = collection.stream();
        stringStream.forEach(System.out::println);
    }

    @Test
    void testCreateStreamInfinite() {
        Stream<String> stream = Stream.generate(() -> "data");
        // stream.forEach(System.out::println);

        Stream<Integer> iterate = Stream.iterate(1, value -> value + 1);
        // iterate.forEach(System.out::println);
    }
}
