import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesApp {
    public static void main(String[] args) {
        try {
            Properties properties = new Properties();

            properties.load(new FileInputStream("application.properties"));

            String host = properties.getProperty("database.host");
            String port = properties.getProperty("database.port");
            String username = properties.getProperty("database.username");
            String password = properties.getProperty("database.password");

            System.out.println(host);
            System.out.println(port);
            System.out.println(username);
            System.out.println(password);

        } catch (FileNotFoundException exception) {
            System.out.println("file not found");
        } catch (IOException exception) {
            System.out.println("Failed to load data from file");
        }

        try {
            Properties properties = new Properties();
            properties.put("hobby", "coding");

            properties.store(new FileOutputStream("personal.properties"), "Personal Information");
        } catch (FileNotFoundException exception) {
            System.out.println("Error create file properties");
        } catch (IOException exception) {
            System.out.println("Error saving properties");
        }
    }

}
