package Collection;

import java.util.ArrayList;
import java.util.List;

public class ListApp {
    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();

        strings.add("A");
        strings.add("B");

        strings.set(0, "C");

        strings.remove(1);
        System.out.println(strings.get(0));

        for (var value : strings) {
            System.out.println(value);
        }
    }
}
