public class ManagerApp {
    public static void main(String[] args) {
        var manager = new Manager("Xizi");
        manager.sayHello("Ron");

        var vp = new VicePresident("Alex");
        vp.sayHello("Joe");

        System.out.println(manager);
        System.out.println(manager.toString());
        System.out.println(vp);
        System.out.println(vp.toString());
    }
}
