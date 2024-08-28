package Collection;

import java.util.Collections;
import java.util.NavigableSet;
import java.util.Set;
import java.util.TreeSet;

public class NavigableSetApp {
    public static void main(String[] args) {

        NavigableSet<String> names = new TreeSet<>();
        names.addAll(Set.of("A", "B", "C", "D", "E"));

        NavigableSet<String> namesReverse = names.descendingSet(); // reverse the name
        NavigableSet<String> fromC = names.tailSet("C", true); // from C to end
        NavigableSet<String> untilC = names.headSet("C", true); // until get C and include c on it
        NavigableSet<String> untilCNotIncluded = names.headSet("C", false); // until get C but not incldue c on it

        for (var name : untilCNotIncluded) {
            System.out.println(name);
        }

        NavigableSet<String> immutable = Collections.unmodifiableNavigableSet(names);
        // immutable.add("F"); // Error
    }
}
