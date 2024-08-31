package Lamda.app;

import java.util.function.Function;

public class FunctionApp {
    public static void main(String[] args) {
        Function<String, Integer> functionLenght = value -> value.length();

        System.out.println(functionLenght.apply("Data1"));
    }
}
