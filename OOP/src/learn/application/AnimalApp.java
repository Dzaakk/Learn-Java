package learn.application;

import learn.data.Animal;
import learn.data.Cat;

public class AnimalApp {
    public static void main(String[] args) {
        Animal animal = new Cat();
        animal.name = "zeze";
        animal.run();
    }
}
