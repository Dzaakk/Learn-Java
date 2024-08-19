package learn.data;

public class Audi implements Car {
    public void drive() {
        System.out.println("Audi drive");
    }

    public int getTier() {
        return 4;
    }

    public String getBrand() {
        return "Audi";
    }

    public boolean isMaintenance() {
        return false;
    }
}
