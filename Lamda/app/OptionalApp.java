package Lamda.app;

import java.util.Optional;

public class OptionalApp {
    public static void main(String[] args) {
        String name = null;

        sayHello("Dan");
        sayHello(name);
    }

    public static void sayHello(String name) {
        // combine
        // Optional.ofNullable(name)
        // .map(String::toUpperCase)
        // .ifPresentOrElse(
        // value -> System.out.println("HELLO " + value),
        // () -> System.out.println("Hello"));

        String upperName = Optional.ofNullable(name)
                .map(String::toUpperCase)
                .orElse("Friend");

        System.out.println("HELLO " + upperName);

        // one by one
        // Optional<String> optionalName = Optional.ofNullable(name);
        // Optional<String> optionalNameUpper = optionalName.map(value ->
        // value.toUpperCase());
        // optionalNameUpper.ifPresent(value -> System.out.println("HELLO " + value));
    }
}
