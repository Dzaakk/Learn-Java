package Lamda.app;

import java.util.function.Function;
import java.util.function.Predicate;

import Lamda.util.StringUtil;

public class MethodReferenceApp {
    public static void main(String[] args) {
        // Predicate<String> predicateIsLowerCase = value ->
        // StringUtil.isLowerCase(value);
        Predicate<String> predicateIsLowerCase = StringUtil::isLowerCase;

        System.out.println(predicateIsLowerCase.test("data"));
        System.out.println(predicateIsLowerCase.test("Data"));

        // Method reference parameter
        // Function<String, String> functionUpper = value -> value.toUpperCase();
        Function<String, String> functionUpper = String::toUpperCase;
        System.out.println(functionUpper.apply("Data2 "));
    }

    public void run() {
        Predicate<String> predicateIsLowerCase = this::isLowerCase; // access method reference not static

        System.out.println(predicateIsLowerCase.test("data"));
        System.out.println(predicateIsLowerCase.test("Data"));

    }

    public void run2() {
        MethodReferenceApp app = new MethodReferenceApp();

        Predicate<String> predicateIsLowerCase = app::isLowerCase; // method referebce object

        System.out.println(predicateIsLowerCase.test("data"));
        System.out.println(predicateIsLowerCase.test("Data"));

    }

    public boolean isLowerCase(String value) {
        for (var c : value.toCharArray()) {
            if (!Character.isLowerCase(c)) {
                return false;
            }
        }
        return true;
    }
}
