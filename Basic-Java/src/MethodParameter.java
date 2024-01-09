public class MethodParameter {
    public static void main(String[] args) {
        sayHello("A", "B");
    }

    static void sayHello(String name1, String name2){
        System.out.println("Hello " + name1 + ", Hello " + name2);
    }
}
