package dzaakk.thread;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

import org.junit.jupiter.api.Test;

public class CyclicBarrierTest {
    @Test
    void test() throws InterruptedException {
        final var cyclicBarrier = new CyclicBarrier(5);
        final var executor = Executors.newFixedThreadPool(10);

        for (int i = 0; i < 5; i++) {
            executor.execute(() -> {
                try {
                    System.out.println("Waiting");
                    cyclicBarrier.await();
                    System.out.println("Done");
                } catch (InterruptedException | BrokenBarrierException e) {
                    e.printStackTrace();
                }
            });
        }

        executor.awaitTermination(1, TimeUnit.DAYS);
    }
}
