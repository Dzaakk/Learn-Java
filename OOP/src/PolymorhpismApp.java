public class PolymorhpismApp {
    public static void main(String[] args) {
        Employee employee = new Employee("Shin");
        employee.sayHello("Joe");

        employee = new Manager("Shin");
        employee.sayHello("Fira");

        employee = new VicePresident("Shin");
        employee.sayHello("Max");

        sayHello(new Employee("Mira"));
        sayHello(new Manager("Haya"));
        sayHello(new VicePresident("Rizki"));
    }

    static void sayHello(Employee employee){
        System.out.println("Hello " + employee.name);
    }
}
