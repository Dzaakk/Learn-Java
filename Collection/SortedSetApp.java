package Collection;

import java.util.Collections;
import java.util.SortedSet;
import java.util.TreeSet;

import Collection.data.Person;
import Collection.data.PersonComparator;

public class SortedSetApp {
    public static void main(String[] args) {
        // SortedSet<Person> people = new TreeSet<>(new PersonComparator());
        SortedSet<Person> people = new TreeSet<>(new PersonComparator().reversed());

        people.add(new Person("Jack"));
        people.add(new Person("Alex"));
        people.add(new Person("twist"));
        people.add(new Person("Charlie"));

        for (var person : people) {
            System.out.println(person.getName());
        }

        SortedSet<Person> sortedSet = Collections.unmodifiableSortedSet(people); // make immutable
        // sortedSet.add(new Person("Mako")); // Error
    }
}
