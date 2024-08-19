package learn.application;

public class EqualsApp {
    public static void main(String[] args) {
        String first = "Agent";
        first = first + " " + "A";

        System.out.println(first);

        String second = "Agent A";
        System.out.println(second);

        System.out.println(first == second);
        System.out.println(first.equals(second));

        String third = "Agent A";
        System.out.println(second == third);
        System.out.println(second.equals(third));
    }
}
