package Lamda.app;

import Lamda.SimpleAction;

public class SimpleActionApp {
    public static void main(String[] args) {
        SimpleAction simpleAction1 = new SimpleAction() {
            @Override
            public String action() {
                return "Data1";
            }
        };

        System.out.println(simpleAction1.action());
        SimpleAction simpleAction2 = () -> {
            return "Data2";
        };

        System.out.println(simpleAction2.action());
    }
}
