package dzaakk.stream;

import java.util.stream.Stream;

import org.junit.jupiter.api.Test;

public class CreateStreamBuildertest {
    @Test
    void testCreateStreamBuilder() {
        Stream.Builder<String> builder = Stream.builder();
        builder.accept("data1");
        builder.add("data2").add("data3");

        Stream<String> stream = builder.build();
        stream.forEach(System.out::println);
    }

    @Test
    void testCreateStreamBuilderSimplify() {
        Stream<Object> stream = Stream.builder()
                .add("data1").add("data2").add("data3").build();

        stream.forEach(System.out::println);
    }
}
