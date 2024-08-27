package Generic.application;

import Generic.MyData;

public class TypeErasureApp {
    public static void main(String[] args) {
        MyData myData = new MyData("Agent B");

        MyData<Integer> integerMyData = (MyData<Integer>) myData;
        Integer integer = integerMyData.getData();
    }
}
