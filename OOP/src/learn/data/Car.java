package learn.data;

public interface Car extends HasBrand, IsMaintenance {
    void drive();

    int getTier();
}
