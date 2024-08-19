package learn.application;

import learn.data.Audi;
import learn.data.Car;

public class CarApp {
    public static void main(String[] args) {
        Car car = new Audi();
        System.out.println(car.getTier());
        car.drive();
    }
}
