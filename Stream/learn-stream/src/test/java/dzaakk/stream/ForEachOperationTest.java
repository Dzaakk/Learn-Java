package dzaakk.stream;

import java.util.List;

import org.junit.jupiter.api.Test;

public class ForEachOperationTest {
    @Test
    void testPeekBefore() {
        List.of("Alex", "Bob", "John").stream()
                .map(name -> {
                    System.out.println("Before Change Name to Upper : " + name);

                    String upper = name.toUpperCase();
                    System.out.println("Change Name to Upper : " + upper);
                    return upper;
                }).forEach(name -> System.out.println("final Name : " + name));
    }

    @Test
    void testPeekAfter() {
        List.of("Alex", "Bob", "John").stream()
                .peek(name -> System.out.println("Before Change Name to Upper : " + name))
                .map(name -> name.toUpperCase())
                .peek(upper -> System.out.println("Change Name to Upper : " + upper))
                .forEach(name -> System.out.println("final Name : " + name));
    }
}
