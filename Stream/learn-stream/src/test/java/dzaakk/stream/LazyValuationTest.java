package dzaakk.stream;

import java.util.List;
import java.util.stream.Stream;

import org.junit.jupiter.api.Test;

public class LazyValuationTest {

    @Test
    void testIntermediateOperation() {
        List<String> names = List.of("Andi", "budi", "ciky");

        Stream<String> upper = names.stream()
                .map(name -> {
                    return name.toUpperCase();
                });

    }

    @Test
    void testTerminalOperation() {
        List<String> names = List.of("Andi", "budi", "ciky");

        names.stream()
                .map(name -> {

                    System.out.println("Change " + name + "to UPPERCASE");
                    return name.toUpperCase();
                })
                .forEach(upper -> {
                    System.out.println(upper);
                });
    }
}
