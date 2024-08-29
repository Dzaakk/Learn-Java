package Collection;

import java.util.Deque;
import java.util.LinkedList;

public class DequeApp {
    public static void main(String[] args) {

        Deque<String> stack = new LinkedList<>();

        stack.offerLast("A");
        stack.offerLast("B");
        stack.offerLast("C");
        stack.offerLast("D");

        System.out.println(stack.pollLast());
        System.out.println(stack.pollLast());
        System.out.println(stack.pollLast());
        System.out.println(stack.pollLast());

        Deque<String> queue = new LinkedList<>();

        queue.offerLast("A");
        queue.offerLast("B");
        queue.offerLast("C");
        queue.offerLast("D");
        System.out.println(queue.pollFirst());
        System.out.println(queue.pollFirst());
        System.out.println(queue.pollFirst());
        System.out.println(queue.pollFirst());

    }
}
