package learn.application;

import learn.data.Customer;
import learn.data.Level;

public class EnumApp {
    public static void main(String[] args) {

        Customer customer = new Customer();
        customer.setName("Agent B");
        customer.setLevel(Level.VIP);

        System.out.println(customer.getName());
        System.out.println(customer.getLevel());
        System.out.println(customer.getLevel().getDescription());

        String levelName = Level.STANDARD.name();
        System.out.println(levelName);

        Level level = Level.valueOf("PREMIUM");
        System.out.println(level);

        System.out.println("Print All Levels");
        for (var value : Level.values()) {
            System.out.println(value);
        }
    }
}
