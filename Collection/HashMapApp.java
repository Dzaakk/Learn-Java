package Collection;

import java.util.HashMap;
import java.util.Map;

public class HashMapApp {
    public static void main(String[] args) {

        Map<String, String> map = new HashMap<>();
        map.put("data1", "Banana");
        map.put("data2", "Watermelon");
        map.put("data3", "Mango");

        System.out.println(map.get("data1"));
        System.out.println(map.get("data2"));
        System.out.println(map.get("data3"));
    }
}
