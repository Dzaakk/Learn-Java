package dzaakk.stream;

import java.util.List;
import java.util.stream.Stream;

import org.junit.jupiter.api.Test;

public class StreamPipelineTest {

    @Test
    void testCreateStreamPipeline() {
        List<String> list = List.of("data1", "data2", "data3");

        Stream<String> stream = list.stream();
        Stream<String> streamUpper = stream.map(name -> name.toUpperCase());
        Stream<String> streamMr = streamUpper.map(upper -> "this is " + upper);

        streamMr.forEach(System.out::println);
    }

    @Test
    void testCreateStreamPipelineOk() {
        List<String> list = List.of("data1", "data2", "data3");

        // this is the real pipeline
        list.stream()
                .map(name -> name.toUpperCase())
                .map(upper -> "this is " + upper)
                .forEach(System.out::println);

    }
}
