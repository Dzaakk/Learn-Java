package Lamda.app;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;

public class MapForEachApp {
    public static void main(String[] args) {

        Map<String, String> map = new HashMap<>();

        map.put("data1", "Orange");
        map.put("data2", "Grape");
        map.put("data3", "Apple");

        // for loop
        for (var entry : map.entrySet()) {
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }

        // forEach anonymous class
        map.forEach(new BiConsumer<String, String>() {
            @Override
            public void accept(String key, String value) {
                System.out.println(key + ":" + value);
            }
        });

        // lamda
        map.forEach((key, value) -> System.out.println(key + ":" + value));

    }
}
