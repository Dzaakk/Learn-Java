package Collection;

import java.util.Hashtable;
import java.util.Map;

public class HashTableApp {
    public static void main(String[] args) {
        Map<String, String> map = new Hashtable<>();

        map.put("data1", "A");
        map.put("data2", "B");
        map.put("data3", "C");
        for (var value : map.keySet()) {
            System.out.println(value);
        }
    }
}
