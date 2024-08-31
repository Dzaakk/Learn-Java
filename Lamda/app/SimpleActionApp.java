package Lamda.app;

import Lamda.SimpleAction;

public class SimpleActionApp {
    public static void main(String[] args) {
        SimpleAction simpleAction1 = new SimpleAction() {
            @Override
            public String action(String name) {
                return "Data1";
            }
        };

        System.out.println(simpleAction1.action("Data1"));
        SimpleAction simpleAction2 = (String name) -> {
            return "Data2";
        };

        System.out.println(simpleAction2.action("Data2"));

        // -----------------------------------
        SimpleAction simpleAction3 = (String value) -> {
            return "Hello " + value;
        };
        SimpleAction simpleAction4 = (name) -> {
            return "Hello " + name;
        };

        SimpleAction simpleAction5 = (String val) -> "Hello " + val;
        SimpleAction simpleAction6 = val -> "Hello " + val;
    }
}
