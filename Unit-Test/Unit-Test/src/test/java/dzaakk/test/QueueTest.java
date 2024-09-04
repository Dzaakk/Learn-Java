package dzaakk.test;

import java.util.LinkedList;
import java.util.Queue;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

@DisplayName("A Queue")
public class QueueTest {

    private Queue<String> queue;

    @Nested
    @DisplayName("when new")
    public class WhenNew {
        @BeforeEach
        void setUp() {
            queue = new LinkedList<>();
        }

        @Test
        @DisplayName("When offer one data, size must be 1")
        void offerOneData() {
            queue.offer("data1");
            Assertions.assertEquals(1, queue.size());
        }

        @Test
        @DisplayName("When offer two data, size must be 2")
        void offerMoreData() {
            queue.offer("data1");
            queue.offer("data2");
            Assertions.assertEquals(2, queue.size());
        }
    }
}
