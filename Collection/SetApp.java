package Collection;

import java.util.HashSet;
import java.util.Set;

public class SetApp {
    public static void main(String[] args) {
        Set<String> names = new HashSet<>();
        // Set<String> names = new LinkedHashSet();

        names.add("Alex");
        names.add("Bob");
        names.add("Chuck");
        names.add("Tom");
        names.add("Alex");
        names.add("Bob");
        names.add("Chuck");
        names.add("Tom");

        for (var name : names) {
            System.out.println(name);
        }
    }
}
