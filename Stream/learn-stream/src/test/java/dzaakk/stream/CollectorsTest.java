package dzaakk.stream;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.junit.jupiter.api.Test;

public class CollectorsTest {
    Stream<String> getStream() {
        return Stream.of("data1", "data2", "data3", "data4", "data5");
    }

    @Test
    void testCollection() {
        Set<String> set = getStream().collect(Collectors.toSet());
        Set<String> immutableSet = getStream().collect(Collectors.toUnmodifiableSet());
        List<String> list = getStream().collect(Collectors.toList());
        List<String> immutableList = getStream().collect(Collectors.toUnmodifiableList());
    }

    @Test
    void testMap() {
        Map<String, Integer> map = getStream().collect(Collectors.toMap(
                name -> name,
                name -> name.length()));
        System.out.println(map);
    }
}
