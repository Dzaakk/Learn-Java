import java.util.Scanner;

public class ScannerApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Name :");
        String name = scanner.nextLine();

        System.out.print("Age : ");
        Integer age = scanner.nextInt();

        System.out.println("Hello " + name + " your age is " + age);

    }
}
