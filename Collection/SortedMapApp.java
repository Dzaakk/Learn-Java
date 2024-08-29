package Collection;

import java.util.Collections;
import java.util.Comparator;
import java.util.SortedMap;
import java.util.TreeMap;

public class SortedMapApp {

    static Comparator<String> stringComparator = new Comparator<String>() {
        @Override
        public int compare(String o1, String o2) {
            return o2.compareTo(o1);
        }
    };

    public static void main(String[] args) {

        SortedMap<String, String> sortedMap = new TreeMap<>(stringComparator);

        sortedMap.put("data1", "A");
        sortedMap.put("data2", "B");
        sortedMap.put("data3", "C");
        sortedMap.put("data4", "D");

        for (var key : sortedMap.keySet()) {
            System.out.println(key);
        }

        SortedMap<String, String> empty = Collections.emptySortedMap();
        SortedMap<String, String> immutable = Collections.unmodifiableSortedMap(sortedMap);

        // immutable.put("data5", "E"); // Error

    }
}
