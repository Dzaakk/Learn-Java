package Generic.application;

import java.util.Arrays;
import java.util.Comparator;

import Generic.Person;

public class ComparatorApp {
    public static void main(String[] args) {
        Person[] people = {
                new Person("Agent A", "Indonesia"),
                new Person("Agent B", "Belgium"),
                new Person("Agent C", "Canada")
        };

        Comparator<Person> comparator = new Comparator<Person>() {

            @Override
            public int compare(Person o1, Person o2) {
                return o1.getName().compareTo(o2.getName());
            }
        };

        Arrays.sort(people, comparator);

        System.out.println(Arrays.toString(people));
    }

}
