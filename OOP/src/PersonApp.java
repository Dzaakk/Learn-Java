public class PersonApp {
    public static void main(String[] args) {
        var person1 = new Person("Rudy","Bandung");

        System.out.println(person1.name);
        System.out.println(person1.address);
        System.out.println(person1.country);

        person1.sayHello("Bambang");

        Person person2 = new Person("Toro");

        Person person3;
        person3 = new Person();
        person3.name = "Caca";
        person3.sayHello("Mamang");

    }
}
