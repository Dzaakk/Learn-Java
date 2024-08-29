package Collection;

import java.util.IdentityHashMap;
import java.util.Map;

public class IdentityHashMapApp {
    public static void main(String[] args) {

        Map<String, String> map = new IdentityHashMap<>();

        String key1 = "data1";
        String data = "data";
        String first = "1";

        String key2 = data + first;

        System.out.println(key1.equals(key2));
        System.out.println(key1 == key2);

        map.put(key1, "Banana");
        map.put(key2, "Banana");

        System.out.println(map.size());
    }
}
