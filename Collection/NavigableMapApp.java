package Collection;

import java.util.Collections;
import java.util.NavigableMap;
import java.util.TreeMap;

public class NavigableMapApp {
    public static void main(String[] args) {
        NavigableMap<String, String> map = new TreeMap<>();

        map.put("data1", "A");
        map.put("data2", "B");
        map.put("data3", "C");
        map.put("data4", "D");
        map.put("data5", "E");

        for (var key : map.keySet()) {
            System.out.println(key);
        }

        System.out.println(map.lowerKey("data3"));
        System.out.println(map.higherKey("data3"));

        NavigableMap<String, String> mapDesc = map.descendingMap();
        for (var key : mapDesc.keySet()) {
            System.out.println(key);
        }

        NavigableMap<String, String> empty = Collections.emptyNavigableMap();
        NavigableMap<String, String> immutable = Collections.unmodifiableNavigableMap(map);

        // immutable.put("data6", "F"); //Error
    }
}
