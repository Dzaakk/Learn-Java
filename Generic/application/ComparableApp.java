package Generic.application;

import java.util.Arrays;

import Generic.Person;

public class ComparableApp {
    public static void main(String[] args) {
        Person[] people = {
                new Person("Agent A", "Indonesia"),
                new Person("Agent B", "Belgium"),
                new Person("Agent C", "Canada")
        };

        Arrays.sort(people);

        System.out.println(Arrays.toString(people));
    }
}
