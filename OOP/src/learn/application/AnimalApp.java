package learn.application;

import learn.annotation.Fancy;
import learn.data.Animal;
import learn.data.Cat;

@Fancy(name = "AnimalApp", tags = { "application", "java" })
public class AnimalApp {
    public static void main(String[] args) {
        Animal animal = new Cat();
        animal.name = "zeze";
        animal.run();
    }
}
