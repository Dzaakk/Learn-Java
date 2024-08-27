package Generic.application;

import Generic.MyData;

public class InvariantApp {
    public static void main(String[] args) {
        MyData<String> stringMyData = new MyData<>("Agent A");
        // doIt(stringMyData); // Error
        // MyData<Object> objecMyData = stringMyData; // Error

        MyData<Object> objectMyData = new MyData<>(1000);
        // MyData<Integer> integerMyData = objectMyData; // Error
        // doItInteger(objectMyData); //Error
    }

    public static void doIt(MyData<Object> objectMyData) {
        // do something
    }

    public static void doItInteger(MyData<Integer> objectMyData) {
        // do something
    }
}
