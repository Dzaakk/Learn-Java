package Collection;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class ImmutableSetApp {
    public static void main(String[] args) {

        Set<String> empty = Collections.emptySet();
        Set<String> one = Collections.singleton("A");

        Set<String> mutable = new HashSet<>();
        mutable.add("B");
        mutable.add("c");

        Set<String> immutable = Collections.unmodifiableSet(mutable);

        Set<String> set = Set.of("B", "C");

        // set.add("D"); // Error
        // set.remove("B"); // Error
    }
}
