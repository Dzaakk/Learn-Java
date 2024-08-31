package Lamda.app;

import java.util.function.Supplier;

public class SuplierApp {
    public static void main(String[] args) {
        Supplier<String> supplier = () -> "Data";

        System.out.println(supplier.get());
    }
}
