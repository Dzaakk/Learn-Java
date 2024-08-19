package learn.application;

import learn.data.City;

public class LocationApp {
    public static void main(String[] args) {
        var city = new City();
        city.name = "Bandung";

        System.out.println(city.name);
    }
}
