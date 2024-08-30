package Collection;

import java.util.Queue;

import Collection.collection.SingleQueue;

public class SingleQueueApp {
    public static void main(String[] args) {
        Queue<String> queue = new SingleQueue<>();

        System.out.println(queue.size());

        System.out.println(queue.offer("A"));
        System.out.println(queue.offer("B"));
        System.out.println(queue.offer("C"));

        System.out.println(queue.size());

        System.out.println(queue.peek());
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.poll());

        System.out.println(queue.size());

    }
}
