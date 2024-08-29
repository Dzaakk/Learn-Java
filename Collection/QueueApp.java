package Collection;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueApp {
    public static void main(String[] args) {
        // Queue<String> queue = new ArrayDeque<>();
        Queue<String> queue = new PriorityQueue<>(); // sorted

        queue.add("D");
        queue.add("C");
        queue.add("B");
        queue.add("A");

        for (String next = queue.poll(); next != null; next = queue.poll()) {
            System.out.println(next);
        }

        System.out.println(queue.size());
    }
}
