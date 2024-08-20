package learn.application;

import static learn.data.Application.*;
import static learn.data.Constant.*;

import learn.data.Country;
import learn.util.MathUtil;

public class StaticApp {

    public static void main(String[] args) {

        System.out.println(APPLICATION);
        System.out.println(VERSION);

        System.out.println(
                MathUtil.sum(1, 2, 1, 2, 1, 2));

        Country.City city = new Country.City();
        city.setName("Subang");

        System.out.println(city.getName());

        System.out.println(PROCESSORS);
    }
}
