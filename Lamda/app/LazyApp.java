package Lamda.app;

import java.util.function.Supplier;

public class LazyApp {
    public static void main(String[] args) {
        testScore(60, () -> getName());
    }

    public static void testScore(int score, Supplier<String> name) {
        if (score > 80) {
            System.out.println("Congratulation! " + name.get());
        } else {
            System.out.println("Whoops Try Again!");
        }
    }

    public static String getName() {
        System.out.println("Method getName()");
        return "Bob";
    }
}
