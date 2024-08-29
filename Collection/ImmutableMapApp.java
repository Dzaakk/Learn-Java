package Collection;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class ImmutableMapApp {
    public static void main(String[] args) {

        Map<String, String> empty = Collections.emptyMap();
        Map<String, String> singleton = Collections.singletonMap("data1", "knife");

        Map<String, String> mutable = new HashMap<>();
        mutable.put("data2", "bag");
        Map<String, String> immutable = Collections.unmodifiableMap(mutable);

        Map<String, String> map = Map.of(
                "data3", "mouse",
                "data4", "shoes",
                "data5", "tumbler");

        // map.put("data6", "laptop"); // error

    }
}
