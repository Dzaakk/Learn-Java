public class ManagerApp {
    public static void main(String[] args) {
        var manager = new Manager();
        manager.name = "Xizi";
        manager.sayHello("Ron");

        var vp = new VicePresident();
        vp.name = "alex";
        vp.sayHello("Joe");
    }
}
