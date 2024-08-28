package Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ImutableListApp {
    public static void main(String[] args) {
        List<String> one = Collections.singletonList("One");
        List<String> empty = Collections.emptyList();

        List<String> mutable = new ArrayList<>();
        mutable.add("A");
        mutable.add("B");
        List<String> immutable = Collections.unmodifiableList(mutable);
        List<String> elements = List.of("D", "E", "F");

    }
}
