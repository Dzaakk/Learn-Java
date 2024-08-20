package learn.data;

public class Application {

    public static final int PROCESSORS;

    static {
        System.out.println("Access Class Aplication");
        PROCESSORS = Runtime.getRuntime().availableProcessors();
    }
}
