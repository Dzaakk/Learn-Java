package dzaakk.stream;

import java.util.List;
import java.util.stream.Stream;

import org.junit.jupiter.api.Test;

public class TransformationOperationTest {

    @Test
    void testMap() {
        List.of("Bambi", "Dabi", "Faby").stream()
                .map(name -> name.toUpperCase())
                .map(upper -> upper.length())
                .forEach(length -> System.out.println(length));
    }

    @Test
    void testFlatMap() {
        List.of("Bambi", "Dabi", "Faby").stream()
                .map(name -> name.toUpperCase())
                .flatMap(upper -> Stream.of(upper, upper.length()))
                .forEach(length -> System.out.println(length));
    }
}
