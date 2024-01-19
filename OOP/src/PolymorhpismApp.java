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
        if (employee instanceof VicePresident vicePresident) {
            System.out.println("Hello VP " + vicePresident.name);
        } else if (employee instanceof Manager manager){
            System.out.println("Hello Manager " + manager.name);
        } else {
            System.out.println("Hello " + employee.name);
        }
    }
}
