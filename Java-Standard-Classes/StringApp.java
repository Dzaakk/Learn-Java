public class StringApp {
    public static void main(String[] args) {
        String name = "Agent C";
        String nameLowerCase = name.toLowerCase();
        String nameUpperCase = name.toUpperCase();

        System.out.println(name);
        System.out.println(nameLowerCase);
        System.out.println(nameUpperCase);
        System.out.println("--------");
        System.out.println(name.length());
        System.out.println(name.startsWith("B"));
        System.out.println(name.endsWith("C"));
    }
}
