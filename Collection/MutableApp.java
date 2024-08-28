package Collection;

import java.util.List;

import Collection.data.Person;

public class MutableApp {
    public static void main(String[] args) {
        Person person = new Person("Agent A");

        person.addHobby("Read a book");
        person.addHobby("Coding");

        doSomething(person.getHobbies());

        for (var hobby : person.getHobbies()) {
            System.out.println(hobby);
        }
    }

    public static void doSomething(List<String> hobbies) {
        hobbies.add("Not a Hobby");
    }
}
