package Collection;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;

public class MapDefaultMethodApp {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("data1", "Bamboo");
        map.put("data2", "Glass");
        map.put("data3", "Rock");

        map.forEach(new BiConsumer<String, String>() {
            @Override
            public void accept(String key, String Value) {
                System.out.println(key + " : " + Value);
            }

        });
    }
}
