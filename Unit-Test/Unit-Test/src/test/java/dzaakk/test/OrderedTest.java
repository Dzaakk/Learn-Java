package dzaakk.test;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestMethodOrder;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class OrderedTest {
    private int counter = 0;

    @Test
    @Order(1)
    void test3() {
        counter++;
        System.out.println(counter);
    }

    @Test
    @Order(3)
    void test2() {
        counter++;
        System.out.println(counter);
    }

    @Test
    @Order(2)
    void test1() {
        counter++;
        System.out.println(counter);
    }
}
