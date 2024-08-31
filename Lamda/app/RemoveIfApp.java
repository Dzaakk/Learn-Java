package Lamda.app;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class RemoveIfApp {
    public static void main(String[] args) {

        List<String> names = new ArrayList<>();
        names.addAll(List.of("Banana", "Watermelon", "Apple", "Orange", "King Fruit"));

        // remove if anonymous class
        names.removeIf(new Predicate<String>() {
            @Override
            public boolean test(String value) {
                return value.length() > 6;
            }
        });

        // lamda
        names.removeIf(name -> name.length() > 6);

        System.out.println(names);
    }
}
