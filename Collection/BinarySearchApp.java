package Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BinarySearchApp {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(1000);

        for (int i = 1; i <= 1000; i++) {
            list.add(i);
        }
        int index = Collections.binarySearch(list, 333);
        System.out.println(index);
    }
}
