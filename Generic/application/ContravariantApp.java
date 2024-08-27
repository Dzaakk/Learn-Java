package Generic.application;

import Generic.MyData;

public class ContravariantApp {
    public static void main(String[] args) {

        MyData<Object> objectMyData = new MyData<>("Agent A");
        MyData<? super String> myData = objectMyData;
        process(objectMyData);

        System.out.println(objectMyData.getData());
    }

    public static void process(MyData<? super String> myData) {
        Object value = myData.getData();
        System.out.println("Process parameter = " + value);

        myData.setData("Agent B");
    }
}
